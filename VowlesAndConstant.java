import java.util.Scanner;

public class VowlesAndConstant {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String : ");

        String input = scanner.nextLine();

        String str = input ;

        Constantandvowles(str);

        scanner.close();
    }

     static void  Constantandvowles(String str){

        int vowels = 0 , consonants = 0;

        str = str.toLowerCase();

        for (char c : str.toCharArray()) {
            if(c >= 'a'&& c <= 'z') {
                if(c=='a'|| c=='e'|| c=='i'||c=='o'||c=='u'){

                    vowels++;
                }else

                    {
                        consonants++;
                    }
            }
            
        }

        System.out.println("The no of vowles are : "+vowels);

        System.out.println("The no of Constant are : "+consonants);

    }
    
}
