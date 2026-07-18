import java.util.Scanner;

public class DuplicateString{

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a String : ");
        String input = scanner.nextLine();
        int []  count = new int[256] ;

        for(int i =0; i<input.length(); i++){
            char c = input.charAt(i);
            count [c]++;      
        }
        System.out.println("Duplicate Characters are sring: ");
        for (int j= 0; j<count.length; j++){
 
            if(count[j] >1){

                System.out.println((char)j +":"+ count[j]);
            }
        }


    }
}