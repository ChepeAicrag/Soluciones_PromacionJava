
import java.util.*;
public class Ordenar
{
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        int[] nums = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Introduce el numero : " + (i + 1));
            nums[i] = leer.nextInt();
        }
        System.out.println(num(nums));
    }
    
    public static String num(int[] a){
        Arrays.sort(a);
        return "El menor es " + a[0] + " y el mayor es " + a[a.length-1]; 
    }
}
