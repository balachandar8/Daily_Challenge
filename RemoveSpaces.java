import java.util.Scanner;

public class RemoveSpaces {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the String: ");

        String input = scanner.nextLine();

        String nospace = input.replace(" ", "");

        System.out.println("Original String :"+input);

        System.out.println("Replaced String: "+nospace);

        scanner.close();

    }
    
}
