import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
       int QualifiedMark = 40;
       int aboveAverage = 75;
        System.out.print("Enter Student's marks:");
       Scanner scanner = new Scanner(System.in);
      Integer myMark =  scanner.nextInt();


       if(myMark<QualifiedMark){
           System.out.println("Try again baby girl");
       }else if (myMark>aboveAverage){
           System.out.println("You are above Average");
       }else {
           System.out.println("You passed");
       }

    }
}
