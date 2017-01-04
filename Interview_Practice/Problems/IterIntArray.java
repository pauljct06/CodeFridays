public class IterIntArray {
    private int[] array;
    private int index;
    private int size;

    public IterIntArray(int[] array) {
        this.array = array;
        this.index = -1;
        this.size = array.length;
    }

    public int next() {
        if (index <= size) {
            this.index++;
            return this.array[this.index];
        }

        return -1;
    }

    public boolean hasNext() {
        return index <= size;
    }

    public void reset() {
        this.index = -1;
    }

    public static void main(String[] args) {
        int[] array1 = {100, 200, 300};
        int[] array2 = {1,2,3,4,5,6,7,8,9,10};

        for (IterIntArray i = new IterIntArray(array1); i.hasNext(); ) {
            int tmp = i.next();
            for (IterIntArray j = new IterIntArray(array2); j.hasNext(); ) {
                System.out.println(tmp + "\t" + j.next());
            }
        }
    }
}