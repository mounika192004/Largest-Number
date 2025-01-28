
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        findLargest(num1, num2, num3);

        scanner.close();
    }

    public static void findLargest(double num1, double num2, double num3) {
        if (num1 >= num2) {
            if (num1 >= num3) {
                System.out.println(num1 + " is the largest number.");
            } else {
                System.out.println(num3 + " is the largest number.");
            }
        } else {
            if (num2 >= num3) {
                System.out.println(num2 + " is the largest number.");
            } else {
                System.out.println(num3 + " is the largest number.");
            }
        }
    }
}


