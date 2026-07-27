import java.util.Scanner;

public class ArmStrongNumber{

    public static void main(String[] args) {

        int arm =0,a,b,c,d, input;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number :");

         input = scanner.nextInt();

         d= input;

         while (input>0) {

            a= input %10;
            input = input/10;
            arm = arm +a*a*a;
                       
         }

         if(arm ==d){

            System.out.println("The entered number are armstrong number ");
         }else {

            System.out.println("The entered number are not an armstrong number ");
         }

         scanner.close();




    }
}