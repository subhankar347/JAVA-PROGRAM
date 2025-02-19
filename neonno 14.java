import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int num = scanner.nextInt();  
        if (isNeon(num)) {
            System.out.println(num + " is a Neon number.");
        } else {
            System.out.println(num + " is not a Neon number.");
        }

        
        scanner.close();
    }

    
    public static boolean isNeon(int number) {
        
        int square = number * number;

        
        int sum = 0;
        while (square > 0) {
            sum += square % 10;  
            square /= 10;  
        }

        
        return sum == number;
    }
}
