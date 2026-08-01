import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {

        // Fibonacci series 5 : 0 1 1 2 3 
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Number to limit the series:");

        int limit = scanner.nextInt();

        int Firstno = 0;
        int Secondno = 1;
        System.out.println("Fibonacci Series of "+ limit +":");

        while (Firstno <= limit) {     
            
            System.out.println(Firstno + " ");

                int nextno = Firstno +Secondno;
                Firstno = Secondno;
                Secondno = nextno;

                
           

        }

        scanner.close();
    }

    
    
}
