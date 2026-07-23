import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number :");

        int number = scanner.nextInt();

        if(number%2 == 0){   //reminder

            System.out.println("Entered number is even");
        }else {

            System.out.println("Entered number is odd");
        }

        scanner.close();

    }
    
}
