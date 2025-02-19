import java.util.Scanner;

public class SquareStarPattern {


    public static void printSquare(int n) {
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows/columns for the square: ");
        int size = scanner.nextInt();
        
        
        printSquare(size);
    }
}
