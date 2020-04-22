/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package karinaaguilar;

import java.util.Scanner;

/**
 * 
 * @author García García José Ángel
 */
public class Material {
    private String tipo;
    
    public void setTipo(String tipo){
        if (this.tipo == null  || this.tipo.equals("PaloMadera")) {
            this.tipo = tipo;
        }else{
            System.out.println("No se puede convertir " + this.tipo + " en " + tipo);
        }
    }
    public String getTipo(){
        return tipo;
    }
    
    public Material(String tipo){
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        while(!correcto){
            if(tipo.equals("Madera") || tipo.equals("PaloMadera") ||
                    tipo.equals("Piedra") || tipo.equals("Hierro") ||
                    tipo.equals("Oro") || tipo.equals("Diamante")){
            this.tipo = tipo; 
            correcto = true;
            }else{
                System.out.println("Introduce un tipo correcto");
                tipo = sc.nextLine();
            }
        }
    }
    
    public static void main(String[] args) {
        Material m = new Material("hola");
        
    }
}
