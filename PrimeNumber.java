import java.util.Scanner; 

public class PrimeNumber { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Enter a Number:"); 
        int input = scanner.nextInt(); 

        if (IsPrime(input)) { 
            System.out.println("Entered number is prime "); 
        } else { 
            System.out.println("Entered Number is not a primenumber "); 
        } 
        scanner.close(); 
    } 

    public static boolean IsPrime(int input) { 
        // Numbers less than or equal to 1 are not prime
        if (input <= 1) {
            return false;
        }

        // Loop brackets fixed: changed i=0 to i=2 to avoid crash
        for (int i = 2; i <= input / 2; i++) { 
            if (input % i == 0) { 
                return false; 
            } 
        } // Closing bracket for the for-loop

        // Placed outside the loop so Java always gets a return value
        return true; 
    } 
}
