import java.util.Scanner;

public class NumberOfWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string value :");

       String input = scanner.nextLine();

       String[]  words = input.trim().split(" ");

       int wordcount = input.trim().isEmpty() ? 0 : words.length;

       System.out.println("The total number of words in String : " +wordcount);
       

    }
    
}
