/**
 * 
 * @author García García José Ángel
 */
public class Calendario{
    private int [][] datos;
    private int anio;
    public Calendario(int anio){
        this.anio = anio;
        cargarCalendario(); // cargamos la información del año
    }
    
    public boolean isBisieto(){
        if(this.anio % 400 == 0){
            return true;
        }else if(this.anio % 4 == 0 && this.anio % 100 != 0){
            return true;
        }
        return false;
    }
    
    private void cargarCalendario(){
        datos = new int[12][31];
        /*
        Meses con 30 días: Abril(3), Junio(5), Septiembre(8) y Noviembre(10).
        Meses con 31 días: Enero(0), Marzo(2), Mayo(4), Julio(6), Agosto(7), Octubre(9) y Diciembre.
        Meses con 28 días: Febrero (Menos cuando es bisiesto que tiene 29 días).
        */
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                if((i == 3 || i == 5 || i == 8 || i == 10) && j < 30){
                    System.out.print(i);
                    datos[i][j] = j + 1;
                }else if(i == 0 || i == 2 || i == 4 || i ==6 || i == 7 
                       || i == 9 || i == 11){
                    datos[i][j] = j + 1;
                }else if(i == 1 && j < 28){ // si es febrero tenemos dos opciones
                        datos[i][j] = j+1; // Llenamos hasta el 28
                        if(j == 27 && isBisieto()){
                            datos[i][j+1] = j +2; // Asignamos 29;
                        }
               }
            }
        }
    }
    
    public void printCalendario(){
        System.out.printf("CALENDARIO DEL AÑO ---- " + this.anio + " ----");
        String[] meses = {"------- Enero -------","------ Febrero ------","------- Marzo -------"
                ,"------- Abril ------- ","------- Mayo --------","------- Junio -------",
                "------ Julio -------","------ Agosto -------"
        ,"----- Septiembre ----","------ Octubre ------","----- Noviembre -----","----- Diciembre -----"};
        for (int i = 0; i < datos.length; i++) {
            System.out.println(meses[i]);
            System.out.printf("[");
            for (int dia : datos[i]) {
                if(dia == 0) 
                    break;
                if(dia == 1) 
                    System.out.printf(" %d",dia);
                else 
                    System.out.printf("%3d",dia);
                if(dia % 7 == 0)
                    System.out.println("");
            }
            System.out.println("]");
        }
    }
    
    public void printHorizontal(){
        System.out.println("\t\t\t\tCALENDARIO DEL AÑO " + this.anio + " \n");
        String[] meses = {"------- Enero -------","------ Febrero ------","------- Marzo -------"
                ,"------- Abril ------- ","------- Mayo --------","------- Junio -------",
                "------ Julio --------","------ Agosto -------"
        ,"----- Septiembre ----","------ Octubre ------","----- Noviembre -----","----- Diciembre -----"};
        int mes = 0;int m = 0;
        for(int c = 0; c < 3; c++){
                for (int i = 0; i < 4; i++) {
                    System.out.printf("%s\t",meses[mes]);
                    mes++;
                }
                System.out.println("");
                int d = 0;
                for (int f = 0; f < 5; f++) {
                    for (int x = 0; x < 4; x++) {
                     for (int y = 0; y < 7; y++) {
                        if(d == 0)
                            System.out.printf("  %d",datos[m][d]);
                        else if(d < 31){
                            if(datos[m][d] != 0)
                            System.out.printf("%3d", datos[m][d]);
                            else
                            System.out.printf("    ");
                        }
                        d++;
                        }if(d < 30)
                            System.out.printf("\t");
                        else
                            System.out.printf("        \t");
                        d = 7 * f;
                            m++;
                    }   if(c== 0)
                        m = 0;
                        else if(c== 1)
                         m = 4;
                        else
                         m = 8;
                    System.out.println("");
                    d = 7 * (f+1);
                }
        }
    }
    
    
    /*
    for (int j = 0; j < 4 ; j++) {
                System.out.printf("%4s ", meses[m]);
            }
            System.out.println("");
            for (int c = 0; c < 4; c++) {
                for (int k = 0; k <7; k++) {
                    if(k == 0)
                    System.out.printf("%d",datos[c][k]);
                    else
                    System.out.printf("%3d",datos[c][k]);
                }
                System.out.printf("   ");
            }
    
    */

}
