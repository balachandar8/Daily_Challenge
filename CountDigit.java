import java.util.Scanner;

public class CountDigit {

    public static void main(String[] args) {

       
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Number for digit count:");

      long  no = scanner.nextLong();

      int count =0;

      if(no==0){

        count = 1;
      }else{

        no = Math.abs(no);

        while(no>0){

            no = no /10;
           count ++;
        }
        
        }

        System.out.println("Number of digit = "+count);

        scanner.close();


    }
    
}
