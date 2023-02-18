public class Q1 {
    public static void main(String args[]){
        int RandomNum = 8;
        int factValue = 1;

        for (int i = 1; i <= RandomNum; i++) {
            factValue = factValue*i;
        }

        System.out.println("Factorial of " + RandomNum + " is " + factValue);
    }
}
