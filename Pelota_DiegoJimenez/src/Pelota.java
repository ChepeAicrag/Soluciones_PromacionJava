
import java.awt.Color;

/**
 * 
 * @author García García José Ángel
 */
public class Pelota {
    private Vector ubicacion, velocidad;
    private int radio;
    private Color color;
    
    public Pelota(){
        ubicacion = new Vector(25, 25);
        velocidad = new Vector();
        radio     = 20;
        color     = Color.BLACK;
    }
    
    public Pelota(int x, int y, int radio){
        setVelocidad(new Vector(x, y));
        setRadio(radio);
    }
    
    public Pelota(int x, int y, int radio, Color color){
        setUbicacion(new Vector(x, y));
        setRadio(radio);
        this.color = color;
    }
    
    public Pelota(Pelota otraPelota){
        this.velocidad = otraPelota.getVelocidad();
        this.ubicacion = otraPelota.getUbicacion();
        this.radio     = otraPelota.getRadio();
        this.color     = otraPelota.getColor();
    }
    
    public Color getColor(){
        return color;
    }
    
    public int getRadio(){
        return radio;
    }
    
    public Vector getUbicacion(){
        return ubicacion;
    }
    
    public Vector getVelocidad(){
        return velocidad;
    }
    
    public void setColor(Color color){
        this.color = color;
    }
    
    public void setRadio(int radio){
        if(radio >= 5 && radio <= 100)
            this.radio = radio;
    }
    
    public void setUbicacion(Vector ubicacion){
        this.ubicacion = ubicacion;
    }
    
    public void setVelocidad(Vector velocidad){
       if(  (velocidad.getX() >= 0 && velocidad.getX() <= 1024) 
               && (velocidad.getY() >= 0 && velocidad.getY() <= 1024))
            this.velocidad = velocidad;
       // Suponemos que no cumplió con los limites correspondientes
       // por buena práctica eviatamos trabajar con variables en null
       // para ello creamos un vector con x = 0 y y = 0
        if (velocidad == null)
            velocidad = new Vector(0,0);
    }
    
    public void botar(){
        System.out.println("Botando desde [" + ubicacion.getX() + "," + ubicacion.getY() + "]");
    }
    
    public void botar(boolean verticalmente){
         if (verticalmente) {
             velocidad.setX(velocidad.getY());
             velocidad.setY(velocidad.getX());
         }
         botar();
    }
    
    public void mover(){
        ubicacion.setX(ubicacion.getX() + velocidad.getX());
        ubicacion.setY(ubicacion.getY() + velocidad.getY());
    }
    
    public String toString(){
        return "";
    }
}
