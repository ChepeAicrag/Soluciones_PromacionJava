
import java.util.Scanner;


/**
 * 
 * @author García García José Ángel
 */
public class Empresa {
    private Empleado empleados[];
    private String nombre;
    private int pos, numEmpleados;
    
    public Empresa(String nombre, int numEmpleados){
        this.numEmpleados = numEmpleados;
        empleados = new Empleado[numEmpleados];
        this.nombre = nombre;
        pos = 0;
    }
    
    public boolean estaVacia(){
        if (numEmpleados != 0) {
            return false;
        }
        return true;
    }
    
    public void agregarEmpleados(){
       if(estaVacia() || pos >= numEmpleados){
            System.out.println("No puede agregar empleados");
        }else{
            for(int i = 0; i < numEmpleados;i++){
                empleados[i] = registro();
            }
        }
    }
    
    private Empleado registro(){
        Empleado e = null;
        String cedula, nombre, departamento, puesto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu cedula");
        cedula = sc.nextLine();
        System.out.println("Introduce tu nombre");
        nombre = sc.nextLine();
        System.out.println("Introduce tu departamento");
        departamento = sc.nextLine();
        System.out.println("Digita el puesto \n1 - Administrador\n2-Mecanico\n3-Vendedor");
        int op = sc.nextInt();
        switch(op){
            case 1:
                puesto = "Administador";
                System.out.println("Introduce tu sueldo mensual");
                int sueldo = sc.nextInt();
                e = new Administrador(cedula, nombre, departamento, puesto,sueldo);
                break;
            case 2:
                puesto = "Mecanico";
                System.out.println("Introduce tu precio por trabajo");
                int precio = sc.nextInt();
                System.out.println("Introduce tus numeros de trabajos");
                int numTrab = sc.nextInt();
                e = new Mecanico(cedula, nombre, departamento, puesto, precio, numTrab);
                break;
            case 3:
                puesto = "Vendedor";
                System.out.println("Introduce tu precio por venta");
                int precioVenta = sc.nextInt();
                System.out.println("Introduce tu numero de ventas");
                int numVen = sc.nextInt();
                e = new Vendedor(cedula, nombre, departamento, puesto, precioVenta, numVen);
                break;
        }
        System.out.println("Se ha agregado correctamente a " + e.getNombre() + " en el puesto " + e.getPuesto());
        return e;
    }
    
    public void mostrarReporteEmpleados(){
        if(estaVacia()){
            System.out.println("No hay empleados");
        }else{
            for (int i = 0; i < empleados.length; i++) {
                System.out.println(empleados[i].datos());
            }
        }
    }
    
    public int numEmpleados(){
        return numEmpleados;
    }
}
