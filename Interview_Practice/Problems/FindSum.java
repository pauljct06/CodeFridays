// TO DO THIS ALSO!!!
// Do this one too, it's fairly easy, but involves you to think:
// say you have a rand6() function which returns you a random number from 1 to 6. Can you make a rand12 function
// which uses the rand6 function to return me (with equal probability) a number from 1 to 12.

public class FindSum {
    public static void main(String[] args) {

        //int[] numbers = {1,2,3,9};
        int[] numbers = {1,2,4,4};
        int sum = 8;

        boolean result = sumFinder(numbers,sum);
        System.out.println(result);
    }

    public static boolean sumFinder(int[] arr, int sum) {
        int head = 0;
        int tail = arr.length - 1;

        while (head < tail) {
            if ((arr[head] + arr[tail]) == sum) {
                return true;
            }
            if ((arr[head] + arr[tail]) < sum) {
                head++;
            }
            if ((arr[head] + arr[tail]) > sum) {
                tail--;
            }
        }
        return false;
    }

}