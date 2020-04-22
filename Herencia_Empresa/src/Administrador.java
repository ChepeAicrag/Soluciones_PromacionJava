
/**
 * 
 * @author García García José Ángel
 */
public class Administrador extends Empleado{
    
    private int sueldoMensual;
    
    public Administrador(String cedula, String nombre, String departamento, String puesto, int sueldoMensual){
        super(cedula, nombre, departamento, puesto);
        this.sueldoMensual = sueldoMensual;
    }
    
    public int getSueldoMensual(){
        return sueldoMensual;
    }
    
    @Override
    public double sueldoQuincenal() {
        return getSueldoMensual() / 2;
    }
    
}
