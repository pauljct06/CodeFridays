public class HashMap {

    private char[] array;
    private int size;

    // default constructor
    public HashMap() {
        this.size = 10;
        this.array = new char[this.size];
    }

    // overloaded constructor
    public HashMap(int size) {
        this.size = size;
        this.array = new char[this.size];
    }

    // filling empty array with -1
    public void fillEmptyArray() {
        for (int i=0; i<array.length; i++) {
            array[i] = '';
        }
    }

    // put a key and value into the hashmap
    public void put(int key, int value) {
        int index = hashcode(key);
        this.array[index] = value;
    }

    // get a value using a key
    public int get(int key) {

    }

    // check if a key exists in the hashmap
    public boolean containsKey(int key) {

    }

    // check if a value exists in the hashmap
    public boolean containsValue(int value) {

    }

    public int hashcode(int key) {
        return (key * 2 / 100 * 100000) % this.size;
    }

    public static void main(String[] args) {

        int[] array = new array[] {1,2,3,4,5};

    }
}