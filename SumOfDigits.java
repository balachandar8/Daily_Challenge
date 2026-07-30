import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Digit of number : ");

        int input = scanner.nextInt();

        int Sumofdigit = CalculateSumOfDigit(input);

        System.out.println("Sum of digit of "+ input +":" +Sumofdigit);

        scanner.close();


    }

    public static int CalculateSumOfDigit(int input) {

        int sum = 0;

        while(input>0){

            int digit = input % 10;

            sum = sum + digit ;

            input = input / 10;
        }


        return sum;


    }
    
}
