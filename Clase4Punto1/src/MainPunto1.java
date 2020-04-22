import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.Set;
import java.util.stream.Collectors;

public class MainPunto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Casa casa1 = new Casa("Choza",5, new ArrayList());
Casa casa2=new Casa("Chalet",2, new ArrayList());
Casa casa3 =new Casa("Departamento",3, new ArrayList());
dueño dueño1=new dueño("Javier");
dueño dueño2=new dueño("Manolo");
dueño dueño3=new dueño("Paco");
dueño dueño4=new dueño("Lolo");
dueño dueño5=new dueño("Juana");
dueño dueño6=new dueño("Beatriz");
dueño dueño7=new dueño("Mariela");
dueño dueño8=new dueño("Marcos");

mascota mascota1 = new mascota("Garfield", casa1,"Gato",dueño1);
mascota mascota2 = new mascota("Pluto", casa2,"Perro",dueño2);
mascota mascota3 = new mascota("Mickey", casa1,"Raton",dueño3);
mascota mascota4 = new mascota("Donald", casa2,"Pato",dueño4);
mascota mascota5 = new mascota("Tom", casa3,"Gato",dueño5);
mascota mascota6 = new mascota("Roby", casa1,"Conejo",dueño6);
mascota mascota7 = new mascota("Pocho", casa1,"Hasmster",dueño7);
mascota mascota8 = new mascota("Dumas", casa1,"Gato",dueño8);


 Set <mascota>ListaDeMascotas=new HashSet <mascota>();
 ListaDeMascotas.add(mascota1);
 ListaDeMascotas.add(mascota2);
 ListaDeMascotas.add(mascota3);
 ListaDeMascotas.add(mascota4);
 ListaDeMascotas.add(mascota5);
 ListaDeMascotas.add(mascota6);
 ListaDeMascotas.add(mascota7);
 ListaDeMascotas.add(mascota8);
List<Casa> ListaCasa=new ArrayList<Casa>();
ListaCasa.add(casa1);
ListaCasa.add(casa2);
ListaCasa.add(casa3);
 


/*Usando las operaciones intermedias y terminales de los stream
implementar un método que nos devuelva el promedio de las
mascotas asignadas cada casa*/
 
OptionalDouble resultado=ListaCasa
		.stream()
		.peek(tipoDeCasa->System.out.println(tipoDeCasa))
		.mapToDouble(Casa->Casa.getCantidadDeMascotas())
		.average();
		
System.out.println("\nEl promedio de: "+resultado.getAsDouble());

Map<String, Double> sum = ListaCasa.stream()
	.collect(Collectors
    .groupingBy(Casa::getTipoDeCasa, Collectors
    .averagingDouble(Casa::getCantidadDeMascotas)));
     System.out.println(sum);


         /*Usando operaciones intermedias de los stream implementar un
         método que nos devuelva la lista de animales de una misma
         especie, hasta que se encuentre un animal de una especie
         diferente */   
         
               /*en la clase mascota implemente un método que al
				mandarle el nombre de la mascota muestre en pantalla el
			nombre del dueño, el numero de casa asignado y el tipo de casa*/
    
         
         /* Usando las operaciones intermedias y terminales de los stream
implementar un método que nos devuelva el total de los
animales de una misma especie(cualquier especie)*/
    
List<mascota> resultado1=ListaDeMascotas.stream()
	.filter(m -> m.getTipoMascota().equals("Gato"))
	.collect(Collectors.toList());
System.out.println("\nla cantidad de animales de esa especie es de: "+ resultado1.size());  
         
         

/*en la clase mascota implemente un método que al
mandarle el nombre de la mascota muestre en pantalla el
nombre del dueño, el numero de casa asignado y el tipo de casa,*/


         System.out.println("");
List<mascota> resultado4=ListaDeMascotas.stream()
	.filter(m -> m.getNombre().equals("Pluto"))
	.peek(casa->System.out.println("Nombre de la mascota: "
	+casa.getNombre()+"- Nombre del "
	+casa.getDueño()
	+casa.getCasa()))
	.collect(Collectors.toList());
     
	}}
         
         
         
         
         
         
         
         
         
         
       
	
	
	
	
	
/* 
ficheros fichero=new ficheros();
fichero.Implementar();
try {
	fichero.insertar();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
fichero.Copiar();

class ficheros{
	private String m;
	public void Implementar() {
		try {
		    PrintWriter writer = new PrintWriter ("/home/pehuen/Escritorio/Examen4Punto7.txt");
		    writer.println();
		  
		    writer.close();
		} catch (Exception e) {
		    e.printStackTrace();
		}
		}
public void insertar() throws IOException {
	FileWriter archivoOriginal =new FileWriter("/home/pehuen/Escritorio/Examen4Punto7.txt");
	try {
		archivoOriginal.write ("\n" + 
				"Casa casa1 = new Casa(\"Choza\",5, new ArrayList());\n" + 
				"Casa casa2=new Casa(\"Chalet\",2, new ArrayList());\n" + 
				"Casa casa3 =new Casa(\"Departamento\",3, new ArrayList());\n" + 
				"\n" + 
				"mascota mascota1 = new mascota(\"Garfield\", casa1,\"Gato\");\n" + 
				"mascota mascota2 = new mascota(\"Pluot\", casa2,\"Perro\");\n" + 
				"mascota mascota3 = new mascota(\"Mickey\", casa1,\"Raton\");\n" + 
				"mascota mascota4 = new mascota(\"Donald\", casa2,\"Pato\");\n" + 
				"mascota mascota5 = new mascota(\"Tom\", casa3,\"Gato\");\n" + 
				"mascota mascota6 = new mascota(\"Roby\", casa1,\"Conejo\");\n" + 
				"mascota mascota7 = new mascota(\"Pocho\", casa1,\"Hasmster\");\n" + 
				"mascota mascota8 = new mascota(\"Dumas\", casa1,\"Gato\");\n" + 
				"\n" + 
				"\n" + 
				" List <mascota>ListaDeMascotas=new ArrayList <mascota>();\n" + 
				" ListaDeMascotas.add(mascota1);\n" + 
				" ListaDeMascotas.add(mascota2);\n" + 
				" ListaDeMascotas.add(mascota3);\n" + 
				" ListaDeMascotas.add(mascota4);\n" + 
				" ListaDeMascotas.add(mascota5);\n" + 
				" ListaDeMascotas.add(mascota6);\n" + 
				" ListaDeMascotas.add(mascota7);\n" + 
				" ListaDeMascotas.add(mascota8);\n" + 
				"List<Casa> ListaCasa=new ArrayList<Casa>();\n" + 
				"ListaCasa.add(casa1);\n" + 
				"ListaCasa.add(casa2);\n" + 
				"ListaCasa.add(casa3);");
		archivoOriginal.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	}
public void Copiar() {
	InputStream inputStream=null;
	OutputStream outputStream=null;
	try {
		File archivoOriginal =new File("/home/pehuen/Escritorio/Examen4Punto7.txt");
		File archivoCopia= new File("/home/pehuen/Escritorio/Examen4Punto7copia.txt");
		inputStream = new FileInputStream(archivoOriginal);
		outputStream= new FileOutputStream(archivoCopia);
		byte[]buffer=new byte[1024];
		int length;
		while((length=inputStream.read(buffer))>0) {
			outputStream.write(buffer,0,length);
					}
	inputStream.close();
	outputStream.close();
	System.out.println("Archivo copiado Exitosamente");
	} catch(IOException e) {
		e.printStackTrace();
	}*/