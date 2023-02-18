import java.util.Arrays;


public class Q14 {

    public static void main(String args[]){

        int[] myArray = {1,2,3,4};
        int result = 0;
        for(int i=0; i<myArray.length; i++){

            result = result + myArray[i];
        }

        System.out.println("Sum of the elements of the array ::"+result);

    }
}
