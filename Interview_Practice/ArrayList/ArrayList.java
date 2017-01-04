public class ArrayList {
    private int size;
    private int curr;
    private int[] array;

    public ArrayList() {
        this(8);
    }

    public ArrayList(int defaultSize) {
        this.size = defaultSize;
        this.curr = 0;
        this.array = new int[size];
    }

    public void add(int x) {
        if (curr == size) {
            resize();
        }

        this.array[curr] = x;
        curr++;
    }

    public int get(int idx) {
        try {
            return this.array[idx];
        } catch(Exception e) {
            System.out.println("Nothing in here");
        }

        return -999;
    }

    public int size() {
        return this.curr;
    }

    public int getTrueSize() {
        return this.size;
    }

    public void resize() {
        int newSize = (int) Math.pow(size, 2);
        int[] tmp = new int[newSize];

        for (int i=0; i<this.array.length; i++) {
            tmp[i] = this.array[i];
        }

        this.array = tmp;
        this.size = newSize;
    }
}