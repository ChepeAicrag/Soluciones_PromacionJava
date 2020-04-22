
/**
 * 
 * @author García García José Ángel
 */
public class Principal {
    public static void main(String[] args) {
        Empresa e = new Empresa("Constructora Costa Rica", 2);
        e.agregarEmpleados();
        e.mostrarReporteEmpleados();
    }
}
