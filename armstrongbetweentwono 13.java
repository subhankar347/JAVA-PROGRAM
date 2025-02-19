import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int start = scanner.nextInt();  

        System.out.print("Enter the second integer: ");
        int end = scanner.nextInt();  

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");
        
    
        for (int num = start; num <= end; num++) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
            }
        }

        
        scanner.close();
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int digits = 0;

        while (number > 0) {
            number /= 10;
            digits++;
        }

        number = originalNumber;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, digits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
