import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter The number :");

        int input = scanner.nextInt();

        if (IsPalindromeNumber(input)){

            System.out.println(input+" is a palindrome.");
        }else{

            System.out.println(input+" is not a palidrome.");
        }

        scanner.close();

    }

     public static boolean  IsPalindromeNumber (int input){


        int OGNumber = input;

        int ReverseNumber = 0;

        while (input != 0){

            int digit = input % 10;

            ReverseNumber = ReverseNumber *10 +digit;

            input = input /10 ;


        }

        return OGNumber == ReverseNumber;




     } 

        


    }
    

