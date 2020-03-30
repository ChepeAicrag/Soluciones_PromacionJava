
/**
 * Write a description of class Cadena here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cadena
{
    public static void main(){
        System.out.print(partir("str",4));
    }
    
    public static String partir(String s, int i){
        String mod = "";
        while(!s.isEmpty()){
            if(s.length() > i){
                mod += s.substring(0,i) + "\n";
                s = s.substring(i,s.length());
            }else{
                mod += s;
                s = "";
            }
        }
        return mod;
    }
}
