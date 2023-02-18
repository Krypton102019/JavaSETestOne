public class Q10 {

    public static void main(String[] args) {
        int[] intArr = {5, 4, 1, 8, 6, 9};
        int temp=0 ;
        for (int i = 0; i < intArr.length; i++) {
            //Decreasing Order Big->small
            for (int i1 = i+1; i1 < intArr.length; i1++) {
                if (intArr[i]<intArr[i1]){
                    temp = intArr[i];
                    intArr[i] = intArr[i1];
                    intArr[i1] = temp;
                }

            }
        }
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]+"\t");
        }

    }

}
