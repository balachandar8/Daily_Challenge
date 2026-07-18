import java.util.Scanner;

public class SentenceReveString{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String Sentence: ");

        String input = scanner.nextLine();

        String[] words = input.split(" ");

       String reverse = "" ; 

        char ch ; 

        

        for (int i = 0; i < words.length; i++){

            String word = words [i];
            String nstr = " ";

             

            for (int j=0; j< word.length(); j++){

                ch = word.charAt(j);

                nstr = ch + nstr; 

            }

            reverse =  reverse + nstr ;      
            
        }

        System.out.println("Reverse words string : "+ reverse);       

        scanner.close();


    }
}