import java.util.Scanner;

public class RightPascalTriangle {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Right pascal tri number : ");

        int input = scanner.nextInt();

        for(int i =1; i<=input; i++){

            for (int j=1; j<=i; j++){

                System.out.print("* ");


            }

            System.out.println();
        }

        for(int i =input-1; i >=1; i-- ){

            for(int j=1; j<=i; j++){

                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();


    }
}
