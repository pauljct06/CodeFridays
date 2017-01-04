import java.util.*;

public class FindMissing {

//[2, 4, 1, 5]

//given array from one to n how to find the missing number

// [1] = -1
// [2] = -1
// [3] = -1
// [4] = -1
// [5] = -1

// [1] =  1
// [2] =  1
// [3] = -1
// [4] =  1
// [5] =  1
    public static void main(String[] args) {

        int[] numbers = {2, 4, 1, 5};
        int answer = missingNum(numbers);
        System.out.println("test");

    }

    public static int missingNum(int [] nums) {

        int nlength = nums.length;
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();

        for(int i=1; i<nlength + 1; i++) {

            myMap.put(i,-1);
        }
        System.out.println(myMap.entrySet());


        return null;

    }

}