import java.util.Scanner;

public class SwapNumber {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the SWap of two numbers ");

        System.out.println("The first number no1 :" );

        int a= scanner.nextInt();

        System.out.println("The Second number no2 :" );

        int b = scanner.nextInt();

        a= a+b;
        b = a-b;
        a = a-b;

        System.out.println("After the swap of two numbers in a :" + a + " ,b:" +b);  
        
        
        scanner.close();


    }
    
}
