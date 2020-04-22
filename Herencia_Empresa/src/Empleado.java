
/**
 * 
 * @author García García José Ángel
 */
public abstract class Empleado {
    private String cedula, nombre, departamento, puesto;
    
    public Empleado(String cedula, String nombre, String departamento, String puesto){
        this.cedula = cedula;
        this.nombre = nombre;
        this.departamento = departamento;
        this.puesto = puesto;
    }
    
    public String getCedula(){
        return cedula;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getDepartamento(){
        return departamento;
    }
    
    public String getPuesto(){
        return puesto;
    }
    
    public abstract double sueldoQuincenal();
    public String datos(){
        return "Cedula:\n " + getCedula() + "\nNombre:\n " + getNombre() + "\nDpto:\n " + getDepartamento() 
                + "\nPuesto:\n " + getPuesto() + "\nSueldo:\n " + sueldoQuincenal();
    
    }
}
