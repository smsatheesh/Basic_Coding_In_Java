import java.util.*;

public class Main {
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for checking prime : ");
        int number = sc.nextInt();
        sc.close();

        if (isPrime((number))) {
            System.out.println("Entered number: " + number + " is a prime number");
        } else {
            System.out.println("Entered number: " + number + " is not a prime number");
        }
    }
}
