public class MatrixAddition {

    public static void main(String[] args) {
        
        int row = 2 , columns = 3;

        int[] [] first = {{1,2,5},{2,5,4}};

        int [] [] Second = {{1,2,5},{8,5,2}};

        int [] [] sum = new  int [row] [columns];
         

        for(int i=0; i<row; i++){

            for (int j=0; j<columns; j++){

                sum [i] [j] = first[i][j] + Second[i][j];

                System.out.println(sum[i][j]+ " ");

            }

            System.out.println();
        }

        
    }
    
}
