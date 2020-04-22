/**
 * 
 * @author García García José Ángel
 */
public class Vendedor extends Empleado{

    private int salarioMinimo = 250000, precioVenta, numVentas;
    
    public Vendedor(String cedula, String nombre, String departamento, String puesto, int precioVenta, int numVentas) {
        super(cedula, nombre, departamento, puesto);
        this.precioVenta = precioVenta;
        this.numVentas = numVentas;
    }

    public int getSalarioMininimo(){
        return salarioMinimo;
    }
    
    public int getPrecioVenta(){
        return precioVenta;
    }
    
    public int getNumVentas(){
        return numVentas;
    }
    
    @Override
    public double sueldoQuincenal() {
        double totalVentas = precioVenta * numVentas;
        return 250000 + (2 * totalVentas / 100);
    }

}
