import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int factorialno = 1;

        System.out.println("Enter the number :");

        int input = scanner.nextInt();

        for(int i = 1; i<=input; i++){

           factorialno  = factorialno * i;

        }

        System.out.println("factorial Number is :" + factorialno);

        scanner.close();
    }
    
}
