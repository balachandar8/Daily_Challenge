import java.util.Scanner;

public class SwapString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         System.out.println("Before Swaping");

         System.out.println("Enter the First String: ");     

         String Str1 = scanner.nextLine();

         System.out.println("Enter the Second String: " );         
         String Str2 = scanner.nextLine();   

        

       

         Str1 = Str1+Str2;

         Str2 = Str1.substring(0,Str1.length()-Str2.length());

         Str1 = Str1.substring(Str2.length());

         System.out.println("String After swap Str1:"+Str1);

         System.out.println("String After swap Str2:"+Str2);


         scanner.close();


    }
    
}
