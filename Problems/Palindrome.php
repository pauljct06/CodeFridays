<?php
$word = "abcdcba";
//$word = "abccba";
//$word = "abczba";
$array = str_split($word);
$max = sizeof($array);
$head = 0;
$tail = $max - 1;
$bool = true; //Need to understand better how to use the global variable

//  0   1   2   3   4   5   6   7
// [a] [b] [c] [d] [d] [c] [b] [a]

echo (isItPalindrome($array, $head, $tail, $bool)) ? 'True' : 'false';
echo "\n";

function isItPalindrome($arr, $h, $t, $bool) {
    if ($h <= $t ) {
        if($arr[$h] == $arr[$t]) {
            $bool = isItPalindrome($arr, $h+1, $t-1, $bool);
        }
        else {
            return false;
        }
    }
    return $bool;
}
?>