public class Q3 {
    public static void main(String[] args) {
        int[] arr = {23, 24, 12, 78, 62};

        int largestNumber = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>largestNumber){
                largestNumber = arr[i];

            }
        }
        System.out.println(largestNumber);


    }

}
