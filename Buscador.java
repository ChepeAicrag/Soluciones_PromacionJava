

/**
 * Clase 01------- METODO BUSCAR ------------
 * Traer problemas que nos interesan en Java
 * 
 * 
   */
import java.util.*;
public class Buscador
{
    public static Vector<String > buscar(String[] nombre, String pal){
    Vector <String> vec = new Vector<String>(nombre.length);
    for(int i=0;i<nombre.length;i++){
      if(nombre[i].toLowerCase().contains(pal.toLowerCase()))
      vec.add(nombre[i]);
    }  
    return vec;
   }
   public static void main(){
    String[] nombres = {"Adrian", "Adelina","jose"};   
    /*Vector<String >vec = buscar(nombres,"Ad");
    for(int i=0;i<vec.size();i++)
    System.out.println(vec.elementAt(i));*/
    System.out.println(buscar2(nombres,"Ad"));
    
   }
   
   private static String buscar2(String[] nombres, String dato){
       String resultado = "";
       for(String nombre : nombres){
          if(nombre.toUpperCase().contains(dato.toUpperCase()))
          resultado += nombre+",";
        }
       return resultado.substring(0,resultado.length()-1); 
    }
   
}
