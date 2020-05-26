package karinaaguilar_matriz;

import java.util.Arrays;

/**
 *
 * @author Garcia Garcia Jose Angel
 */
public class KarinaAguilar_Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KarinaAguilar_Matriz ejemplo = new KarinaAguilar_Matriz();
        int matrix[][] = ejemplo.matrix_factorial_recursive(3, 3, 5);
        for(int i = 0; i < matrix.length; i++ ){
            for (int j = 0; j < matrix[i].length; j++) {
                    System.out.printf("%6d",matrix[i][j]);
            }
            System.out.println("");
        }
    }
    
    private int[][] matrix_factorial_recursive(int rows, int columns, int number){
        int[][] matrix = null;
        if((rows == 0 || columns == 0) || ((rows * columns -1 ) < number ) || number < 0){
            System.out.println("Rellene correctamente");
            return matrix; // Ojo, retorna un null
        }
        matrix = new int[rows][columns]; // Creamos la matrix de tal tamaño
        int numFactorial = 0;
        for(int i = 0; i < matrix.length; i++ ){
            for (int j = 0; j < matrix[i].length; j++) {
               if(numFactorial <= number){
                   matrix[i][j] = factorial(numFactorial);
               }else{
                    matrix[i][j] = 0;
               }
                numFactorial++;
            }
        }
        
        return matrix;    
    }
    private int factorial(int n){
        if (n == 0) 
            return 1;
        return n * factorial(n-1);
    }
    
    
}
