import java.util.Random;

public class ReadStream {

    private class Stream {
        private int index;
        private int max;
        private Random rand;

        public Stream(int max) {
            this.index = 0;
            this.max = max;
            this.rand = new Random();
        }

        public Integer hasNext() {
            if (++this.index < this.max)
                return new Integer(this.rand.nextInt(this.max));
            else
                return null;
        }
    }

    private int[] array;
    private Stream stream;

    public ReadStream(int max) {
        this.array = new int[50];
        this.stream = new Stream(max);
    }

    public int getRandomNum() {
        int rand = -1;
        int maxlength = 0;
        int prevrand = -1;
        int i = 0;

        Integer num = this.stream.hasNext();

        while (num != null) {

           array[i] = num;
           num = this.stream.hasNext();
           i++;
           if(i == array.length ) {

               rand = ee;


           }

        }return rand;
    }


        /*Random random = new Random();

        rand = random.nextInt(array.length);

        if (rand == prevrand) {
            rand = random.nextInt(array.length);
        }
        prevrand = rand;
        return rand;
    }*/

    public static void main(String[] args) {
        ReadStream rs = new ReadStream(5000);
        int rand = rs.getRandomNum();
        System.out.println(rand);
    }

}