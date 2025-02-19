import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();  

        System.out.print("Enter the rate of interest (R) per annum: ");
        double rate = scanner.nextDouble();  

        System.out.print("Enter the time (T) in years: ");
        double time = scanner.nextDouble();  

        
        double compoundInterest = calculateCompoundInterest(principal, rate, time);

        
        System.out.println("The Compound Interest is: " + compoundInterest);


        scanner.close();
    }

    
    public static double calculateCompoundInterest(double principal, double rate, double time) {
        
        double amount = principal * Math.pow(1 + (rate / 100), time);

        return amount - principal;
    }
}
