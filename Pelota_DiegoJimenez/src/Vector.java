/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author García García José Ángel
 */
public class Vector {
    private int x, y;
    
    public Vector(){
        x = y = 0;
    }
    
    public Vector(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public Vector(Vector otroVector){
        this.x = otroVector.getX();
        this.y = otroVector.getY();
    }
    
    public Vector sumar(Vector otroVector){
        return new Vector(this.x + otroVector.getX(), this.y + otroVector.getY());
    }
    
    public String toString(){
        return "[" + x + "][" + y + "]";
    }
    
    
    public void setX(int x){
        this.x = x;
    }
    
    public void setY(int y){
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
   
}
    
