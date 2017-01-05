public class RotateArray {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8}; // 3, 4, 5, 6, 7, 8, 1, 2
    int rotations = 2;

    // reversing individual parts of the array especially 3 times
    // 2 1 3 4 5
    // 2 1 5 4 3
    // 3 4 5 1 2


    int[] newArray = rotateArray(array, rotations);

    for (int x: newArray) {
      System.out.print(x + " ");
    }

    System.out.println();
  }

  public static int[] rotateArray(int[] array, int rotations) {
    reverseArray(array, 0, rotations - 1);
    reverseArray(array, rotations, array.length - 1);
    reverseArray(array, 0, array.length - 1);

    return array;
  }

  public static void reverseArray(int[] array, int start, int end) {
    while (start < end) {
      int temp = array[start];
      array[start] = array[end];
      array[end] = temp;
      start++;
      end--;
    }
  }
}
