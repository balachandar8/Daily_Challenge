import java.util.Scanner; // 1. Added required import

public class OnlyAlphabet {
    public static void main(String[] args) { // 2. Fixed 'static' lowercase

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String :");
        String input = scan.nextLine();

        // 3. Fixed 'replaceAll' and added the second parameter ""
        String onlywords = input.replaceAll("[^a-zA-Z]", "");

         // input = 45yeg$^8jh@ , output = yegjh

        System.out.println(onlywords);
        
        scan.close(); // Good practice to close the scanner
    }
}
