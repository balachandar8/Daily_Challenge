import java.util.Scanner;

public class UserInputMatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows & Columns: ");
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] m1 = new int[r][c], m2 = new int[r][c], sum = new int[r][c];

        System.out.println("Input Matrix 1:");
        for (int i = 0; i < r; i++) 
            for (int j = 0; j < c; j++)
               m1[i][j] = sc.nextInt();

        System.out.println("Input Matrix 2:");
        for (int i = 0; i < r; i++) 
            for (int j = 0; j < c; j++)  
              m2[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
