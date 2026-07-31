import java.util.Arrays;
import java.util.HashSet;

public class CommonEleArray {

    public static void main(String[] args) {
        
        Integer[] str1 = {1,2,3,4};

        Integer [] str2 = {1,2,2,4};

        HashSet <Integer> set1 = new HashSet<>(Arrays.asList(str1));
        HashSet <Integer> common = new HashSet<>();

        for (Integer num : str2){

            if(set1.contains(num)){
                common.add(num);


            }
        }

        System.out.println( common);


    }
    
}
