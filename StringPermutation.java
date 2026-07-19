import java.util.Scanner;

public class StringPermutation {

    public static void main(String[] args) {
        
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Enter a String: ");

         String input = scanner.nextLine();

        System.out.println("Enter the String value for Permutation "+ input + ":" );

        findpermutations(input, "");

        scanner.close();

    }

        public static void findpermutations(String str, String answer){

            if(str.length()== 0){
                System.out.println(answer);
                return;
            }

            for(int i=0; i<str.length(); i++)
            {
                char ch = str.charAt(i);

                String rem = str.substring(0,i) + str.substring(i+1);
                findpermutations(rem,answer+ch);

                

            }

            

        }       


    }
    

