import java.util.Scanner;

public class SquarePatt {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter the nuber for size of the box :");

        int input =scanner.nextInt();

        for(int i=1; i<=input; i++){

            for (int j=1; j<= input ; j++){

                if(i==1 || i == input || j==1 || j== input){

                    System.out.print("*");

                }else {

                    System.out.print(" ");
                }

                
            }
        }

        scanner.close();
    } 
    
}
