public class reverseInt {
  public static int[] reverse(int[] array) {

    if (array == null || array.length == 0) {
         throw new Exception();
    }

    int size = array.length;
    int head = 0;
    int tail = size - 1;

    int temp;
    while (head < tail) {
        temp = array[head];
      array[head] = array[tail];
      array[tail] = temp;
      head++;
      tail--;
    }
      return array;
  }
  public static void main(String[] args) {
    int[] arr = {3,4,1,5};
    int[] myarray = reverse(arr);
    for (int i=0; i < myarray.length; i++) {
      System.out.print(myarray[i] + " ");
    }
  }
}
