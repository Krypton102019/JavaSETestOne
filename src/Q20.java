public class Q20 {
    public static void main(String[] args) {
// Input number
        int n = 4;

        int tempNum = 0;

        if (n <= 1) {
            System.out.println("The number is not prime");

        }

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                tempNum++;
            }
        }
        if (tempNum > 1) {
            System.out.println("The number is not prime");
        }
        else {
            System.out.println("The number is prime");
        }
    }

    }

