import java.util.Arrays;

public class Q15 {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5,6,7,8,9,10};
        int numberOfEven= 0;
        int numberOfOdd= 0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i]%2 == 1){
               numberOfEven++;

            }else {
                numberOfOdd++;
            }
        }



        System.out.println("This is number of Even in " + Arrays.toString(intArr) +" is :" +numberOfEven);
        System.out.println("This is number of Odd in " + Arrays.toString(intArr) +" is :" +numberOfOdd);
    }

}
