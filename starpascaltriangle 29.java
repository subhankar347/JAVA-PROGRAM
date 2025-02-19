import java.util.Scanner;

public class StarPascalsTriangle {
    
    
    public static void printStarPascalsTriangle(int n) {
        
        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            
        
            for (int j = 0; j <= i; j++) {
                
                if (j == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            
            
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = scanner.nextInt();
        
    
        printStarPascalsTriangle(rows);
    }
}
