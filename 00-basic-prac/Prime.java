import java.util.Scanner;
public class Prime{
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        try (Scanner scan = new Scanner(System.in)) {
            int num = scan.nextInt();
            boolean isPrime = checkIsPrime(num);
            if(isPrime) {
                System.out.println("Is prime");
            } else {
                System.out.println("Is not prime");
            }
        }
    }

    static boolean checkIsPrime(int num) {
        if(num == 1) return false;
        if(num == 2) return true;

        int half = num / 2;
        for(int i=2; i<=half; ++i) {
            if(num%i == 0) return false;
        }

        return true;
    }
}