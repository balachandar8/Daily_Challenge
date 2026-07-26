import java.util.Scanner;

public class Reserve{


    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number :");

        int OGno = scanner.nextInt();

        int Originalno ,reverseno =0 ;

         while (OGno>0) {

            Originalno = OGno % 10;

            reverseno = reverseno *10 + Originalno ;

            OGno = OGno /10;        
            
        }

        System.out.println("The Reverse number are :" +reverseno);

        scanner.close();

    }
    
}