# Charley Padron
# Lab 2 Windchill

		.data
		
temp:		.asciiz	"Enter a temperature: "
output1:	.asciiz	"temp: "
output2:	.asciiz	"windspeed	windchill"
space:		.asciiz	"		"
newLine:	.asciiz	"\n"

array:		.space	228	# array of 57 
tempNum:	.float	0.0
loopExit:	.float	50.0	# used to exit loop if temperature entered is higher then 50.0

# float variables to hold constants
cons1:		.float	35.74	# $f1
cons2:		.float	0.6125	# $f2
cons3:		.float	35.75	# $f3
cons4:		.float	0.4275	# $f4

wind:		.float	3.0	# starting wind speed
windAdd:	.float	1.0	# add 1 to windspeed
						
		.globl main
		.text

main:
	# load constants to resgisters
	l.s	$f11, cons1	# holds 35.74
	l.s	$f2, cons2	# holds 0.6125
	l.s	$f3, cons3	# holda 35.75
	l.s	$f4, cons4	# holds 0.4275
	
	l.s	$f6, windAdd	# holds 1.0
	
	l.s	$f7, loopExit
	
	lui	$t0, 0x1001	# $t0 base address of data segment
	ori	$t1, $0, 57	# $t1 size of array [57]
	ori	$t3, $0, 0	# loop counter
	move	$t2, $t0	# $t2 will contain add of array element

readLoop:
	# output temp string
	li	$v0, 4		# call codde for print string
	la	$a0, temp	# load address of temp t $a0
	syscall			# print string
	
	# read in temp number
	li	$v0, 6		# call code for read float
	syscall			# reads in float
	mov.s	$f8, $f0
	#s.s	$f0, tempNum	# stores value stored in $f0 to tempNum

	# exits loop if tempNum is higher than 50
	c.lt.s	$f8, $f7
	bc1t	loop
	

loop:
	l.s	$f5, wind	# store 3 to $f5, 3 is starting array and windspeed
	s.s	$f5, 0($t2)	# store it in the array
	
	# calculates windchill -- windchill = 35.74 + 0.6125T - 35.75V + 0.4275TV
	# windspeed = $f1 + $f2($f0) + $f3($f5) + $f4($f0)($f5)
	mul.s	$f8, $f8, $f5	# $f8 = T x V
	mul.s	$f8, $f8, $f4	# $f8 = 0.4275 x $f8
	mul.s	$f9, $f3, $f5	# $f9 = 35.75 x V
	add.s	$f9, $f9, $f8	# $f9 = $f9 + $f8
	mul.s	$f10, $f2, $f0	# $f10 = 0.6125 x T
	sub.s	$f10, $f10, $f9	# $f10 = $f10 - $f9
	#add.s	$f11, $f11, $f10	# $f11 = 35.74 + $f10
	#sub.s	$f11, $f11, $f9		# $f11 = $f11 - $f9
	
	ceil.w.s $f11, $f11	# rounds to nearest twos compl
	mfc1	$t7, $f11	# translate two compl to int
	
	li	$v0, 4		# call code for print string
	la	$a0, output1	# load address of output1 to $a0
	syscall			# print string
	
	
	li	$v0, 2		# call code for print float
	mov.s	$f12, $f0	# copy temp to $f12
	syscall			# print float
	
	li	$v0, 4		# call code for print string
	la	$a0, newLine	# load address of output1 to $a0
	syscall			# print string
	
	li	$v0, 4		# call code for print string
	la	$a0, output2	# load address of output2 to $a0
	syscall			# print string
	
	li	$v0, 4		# call code for print string
	la	$a0, newLine	# load address of output1 to $a0
	syscall			# print string
	
	li	$v0, 2		# call code for print float
	mov.s	$f12, $f5	# copy windspeed to $f12
	syscall			# print float
	
	li	$v0, 4		# call code for print string
	la	$a0, space	# load address of output2 to $a0
	syscall			# print string
	
	li	$v0, 1 # 2	# call code for print float
	move $a0, $t7		# print value in coproc 1	
	# mov.s	$f12, $f11	# copy windchill to $f12
	syscall			# print float
	
	addi	$t2, $t2, 4	# address of next array
	add.s	$f5, $f5, $f6	# adds 1 to windspeed
	addi	$t3, $t3, 1	# add 1 to loop counter
	
	blt	$t1, $t3, readLoop	# branch to readLoop if counter is greater than array size
			
end:
	 li        $v0, 10           # terminate execution and
         syscall                     # return control to system
       
