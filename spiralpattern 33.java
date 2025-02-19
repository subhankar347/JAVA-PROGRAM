import java.util.Scanner;

public class SpiralPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Enter the size of the matrix (N x N): ");
        int n = sc.nextInt();
        
        int[][] spiral = new int[n][n];
        int num = 1; 
        
        int top = 0, bottom = n - 1, left = 0, right = n - 1;
        
        
        while (num <= n * n) {
            
            for (int i = left; i <= right; i++) {
                spiral[top][i] = num++;
            }
            top++;  
            for (int i = top; i <= bottom; i++) {
                spiral[i][right] = num++;
            }
            right--;  
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiral[bottom][i] = num++;
                }
                bottom--;  
            }
            
            
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiral[i][left] = num++;
                }
                left++;  
            }
        }
        
        
        System.out.println("Spiral Pattern:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(spiral[i][j] + "\t");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
