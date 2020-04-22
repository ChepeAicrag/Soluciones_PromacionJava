
/**
 * 
 * @author García García José Ángel
 */
public class Mecanico extends Empleado{
    private int precioTrabajo, numTrabajos;
    
    public Mecanico(String cedula, String nombre, String departamento
            , String puesto,int precioTrabajo,int numTrabajos){
        super(cedula, nombre, departamento, puesto);
        this.precioTrabajo = precioTrabajo;
        this.numTrabajos = numTrabajos;
    }
    
    public int getPrecioTrabajo(){
        return precioTrabajo; 
    }
    
    public int getNumTrabajos(){
        return numTrabajos;
    }

    @Override
    public double sueldoQuincenal() {
      double total = getNumTrabajos() * getPrecioTrabajo();
      return 4 * total / 100;  
    }
    /*
    public String Datos(){
        return "Cedula\n" + getCedula() + "\nNombre\n" + getNombre() + "\nDpto\n" + getDepartamento() 
                + "\nPuesto\n" + getPuesto() + "\nSueldo\n" + sueldoQuincenal();
    }*/
}
