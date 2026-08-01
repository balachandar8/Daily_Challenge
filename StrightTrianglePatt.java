import java.util.Scanner;

public class StrightTrianglePatt {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the Number of amx value ");

        int input = scanner.nextInt();

        for(int i = 1; i<= input; i++){

            // System.out.println();

            for(int j=1 ; j<= i; j++){

                 System.out.print("*");               

                
            }

           

            System.out.println();

            


        }
        scanner.close();
    }
    
}
