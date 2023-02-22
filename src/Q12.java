import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
       int[] arr2 = {1, 2, 3, 4, 5};

        int index2 = 2; // the index of the element to be deleted

// use System.arraycopy() to delete the element
        System.arraycopy(arr2, index2 + 1, arr2, index2, arr2.length - index2 - 1);
        System.out.println(Arrays.toString(arr2));
// decrease the size of the array by one
        int[] newArr2 = new int[arr.length - 1];
        System.arraycopy(arr2, 0, newArr2, 0, newArr2.length);
        System.out.println(Arrays.toString(newArr2));

    }
}
