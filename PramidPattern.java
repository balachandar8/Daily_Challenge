import java.util.Scanner;

public class PramidPattern {

    public static void main (String [] agrs){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the row of value to print :");

       int  input =scanner.nextInt();

       for(int i = 1; i<=input; i++){

        for(int j=1; j<= input -i; j++){

            System.out.print(" ");
        }

        for(int k =1; k<= (2 *i-1); k++){

            System.out.print("*");
        }
        System.out.println();
       }

       scanner.close();

       


    }
    
}
