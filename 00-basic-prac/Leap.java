import java.util.Scanner;

public class Leap {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int year = sc.nextInt();
            if (year % 4 == 0) {
                if (year % 100 == 0 && year % 400 != 0) {
                    System.out.println("False");
                } else {
                    System.out.println("True");
                }
            } else {
                System.out.println("False");
            }
        }
    }
}
