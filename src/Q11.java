import java.util.Arrays;

public class Q11 {

    public static void main(String[] args) {
        int[] arr = new int[]{121,334,2435,534,155};
        int[] arr2 = new int[arr.length-1];
    
        for(int i=0;i<arr.length;i++){
            for (int i1 = i; i1 < arr2.length; i1++) {
                if(arr[i]!=2435){
                    arr2[i1]=arr[i];
                    ;
                }
            }
        }
        System.out.println("Before deletion :" + Arrays.toString(arr));
        System.out.println("After deletion :" + Arrays.toString(arr2));

    }
}
