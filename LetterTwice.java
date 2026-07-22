import java.util.Scanner;

public class LetterTwice {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Word:");

         String input= scanner.nextLine();

         String twice = "";

         

         for(int i =0; i<input.length(); i++){

            char ch = input.charAt(i);

            twice = twice + ch + ch;             

         }

         System.out.println("The two times twice word are :"+twice);

         scanner.close();        


    }
    
}
