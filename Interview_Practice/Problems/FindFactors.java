public class FindFactors {

    public static void main (String args[]) {

        int[] sortedarray = {1,2,3,4,5,6,7,8,9};
        int number = 33;
        newfindfactors(sortedarray,number);


    }

    //O(n/2)
    public static void newfindfactors(int[] array, int goal) {

        int head = 0;
        int tail = (array.length - 1);

        while ( head != tail) {

            if (array[head] * array[tail] == goal) {
                System.out.println(array[head] + " * " + array[tail]);
                return;
            }

            if (array[head] * array[tail] < goal) {
                head++;
                continue;
            }
            if (array[head] * array[tail] > goal) {
                tail--;

            }
        }
        System.out.println("There are not multiples of " + goal);


    }

    //O(n^2)
    public static void findfactors(int[] array, int goal) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                if(array[i] * array[j] == goal) {

                    System.out.println(array[i] + "\n" + array[j]);
                    return;
                }
            }
        }
    }

}