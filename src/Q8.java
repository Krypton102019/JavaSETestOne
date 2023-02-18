import java.util.Arrays;

public class Q8 {

    public static void main(String[] args) {
        int[][] twoDiArr = {{1,2,3,4,5},
                            {5, 4, 3, 2, 1},
                            {7, 8, 9, 1, 5, 7 ,7}};
        for (int i = 0; i < twoDiArr.length; i++) {
            for (int i1 = 0; i1 < twoDiArr[i].length; i1++) {
                System.out.print(twoDiArr[i][i1]+"\t");
            }
            System.out.println();
        }



    }

}
