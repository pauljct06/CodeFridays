import java.util.Arrays;

public class Naive {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 2, 3, 4, 5};
        int[] arr2 = new int[] {3, 6, 7, 8, 9};

        int duplicate = findDupe(arr1, arr2);
        System.out.println(duplicate);
    }

    // O(n)
    public static int findDupe(int[] arr1, int[] arr2) {

        int smallest_1 = arr1[0];
        int largest_1 = arr1[arr1.length - 1];

        int smallest_2 = arr2[0];
        int largest_2 = arr2[arr2.length - 1];

        int largest;

        if (largest_1 > largest_2) {
            largest = largest_1;
        } else {
            largest = largest_2;
        }

        int[] memory = new int[largest + 1];
        // [0] [1] [1] [2] [1] [1] [1] [1] [1] [1] [0]

        for (int i=0; i<memory.length; i++) {
            memory[i] = 0;
        }

        for (int i=0; i<arr1.length; i++) {
            int current = arr1[i];
            memory[current]++;
        }

        for (int i=0; i<arr2.length; i++) {
            int current = arr2[i];
            memory[current]++;
        }

        for (int i=0; i<memory.length; i++) {
            if (memory[i] > 1) {
                return i;
            }
        }

        return -1;
    }

    // O(n logn)
    public static int findDupe_nlogn(int[] arr1, int[] arr2) {
        int[] newArray = new int[arr1.length + arr2.length];
        int newArrayIndex = 0;

        // O(n)
        for (int i=0; i<arr1.length; i++) {
            newArray[newArrayIndex] = arr1[i];
            newArrayIndex++;
        }

        // O(n)
        for (int i=0; i<arr2.length; i++) {
            newArray[newArrayIndex] = arr2[i];
            newArrayIndex++;
        }

        // O(logn)
        Arrays.sort(newArray);

        int curr = newArray[0];
        int next = newArray[0];

        // O(n)
        for (int i=0; i<newArray.length - 1; i++) {
            curr = newArray[i];
            next = newArray[i + 1];

            if (curr == next) {
                return curr;
            }
        }

        return curr;
    }

    // O(n^2)
    public static int findDupe_n2(int[] arr1, int[] arr2) {

        for (int i=0; i<arr1.length; i++) {
            for (int j=0; j<arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    return arr1[i];
                }
            }
        }

        return arr1[0];
    }
}