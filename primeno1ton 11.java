import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();  
        System.out.println("Prime numbers from 1 to " + N + " are:");

        for (int num = 2; num <= N; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

        
        scanner.close();
    }

    
    public static boolean isPrime(int number) {
    
        if (number <= 1) {
            return false;
        }

        
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;  
            }
        }
        return true;  
    }
}
