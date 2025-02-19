import java.util.Scanner;

public class FibonacciEvenSum {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();  
        int evenSum = getEvenSumOfFibonacci(N);

    
        System.out.println("The sum of even Fibonacci numbers up to " + N + " is: " + evenSum);

        
        scanner.close();
    }

    
    public static int getEvenSumOfFibonacci(int N) {
        int a = 0, b = 1, evenSum = 0;

        while (b <= N) {
            
            if (b % 2 == 0) {
                evenSum += b;  
            }

            int next = a + b;
            a = b;
            b = next;
        }

        return evenSum;
    }
}
