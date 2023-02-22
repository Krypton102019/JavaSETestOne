import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
      int[] arr = {1, 2, 3, 4, 5};

        int index = 2; // the index of the element to be deleted

// shift the elements after the deleted element to the left using a nested for loop
        for (int i = index; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
        }
        System.out.println(Arrays.toString(arr));
// decrease the size of the array by one
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i];
        }

        System.out.println(Arrays.toString(newArr));

    }
}
