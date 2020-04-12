
/**
 * Tabla de conversiones usando Recursividad
 * 
 * @author García García José Ángel
 * @version 12/04/2020
 */
public class Conversion
{
   
    public static String convertHexa(int N){
        if(N < 10) return "" + N;
        if(N < 16) return "" + "ABCDEF".charAt(N - 10);
        return convertHexa(N / 16) + convertHexa(N % 16);
    }
    
    public static String convertOctal(int N){
        if(N < 8) return " " + N;
       return convertOctal(N / 8) + (N % 8); 
    }
    
    public static String convertBinario(int N){
        if(N == 1) return "1";
        return convertBinario(N / 2) + (N % 2);
    }
    
    public static void main(){
        System.out.printf("%10s%19s%19s%21s%n","Decimal","Binario","Octal","Hexadecimal");
        for(int i = 1; i < 50; i++)
            System.out.printf("%8s%18s%20s%18s%n",i,convertBinario(i),convertOctal(i),convertHexa(i));
    }
}