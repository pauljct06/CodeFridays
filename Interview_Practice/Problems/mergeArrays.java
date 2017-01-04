public class mergeArrays {
    public static void main (String[] args) {
        int[] array1 = {1,3,5,8,9,11};
        int[] array2 = {2,4,6,8,8,10,12,13};

        int[] answer = mergeArrays(array1,array2);

        printArray(answer);

    }

    public static int[] mergeArrays(int[] arr_1, int[] arr_2) {

        int maxLength = arr_1.length+arr_2.length;
        int newarray[] = new int[maxLength];

        int p1 = 0, p2 =0, p3 = 0;
        while (p1 < arr_1.length && p2 < arr_2.length)
            if (arr_1[p1] < arr_2[p2])
                newarray[p3++] = arr_1[p1++];
            else
                newarray[p3++] = arr_2[p2++];

        while (p1 < arr_1.length)
            newarray[p3++] = arr_1[p1++];

        while (p2 < arr_2.length)
            newarray[p3++] = arr_2[p2++];

        return newarray;
    }

    public static void printArray(int[] array) {

        for (int j=0; j<array.length; j++)
        {
            System.out.print(array[j] + " ");
        }
        System.out.println("");
    }

}

