import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class mascota {
	private String nombre;
	private Casa casa;
	private String tipoMascota;
	private dueño dueño;
	
	public mascota(String nombre,Casa casa,String tipoMascota, dueño dueño) {
		this.nombre=nombre;
		this.casa=casa;
		this.tipoMascota=tipoMascota;
		this.dueño=dueño;
	}
	
	public dueño getDueño() {
		return dueño;
	}

	public void setDueño(dueño dueño) {
		this.dueño = dueño;
	}

	public String toString(){
		return "Nombre de la mascota:"+nombre+"- Tipo de mascota: "  +tipoMascota;
	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Casa getCasa() {
		return casa;
	}

	public void setCasa(Casa casa) {
		this.casa = casa;
	}

	public String getTipoMascota() {
		return tipoMascota;
	}

	public void setTipoMascota(String tipoMascota) {
		this.tipoMascota = tipoMascota;
	}
	
	/*en la clase mascota implemente un método que al
mandarle el nombre de la mascota muestre en pantalla el
nombre del dueño, el numero de casa asignado y el tipo de casa,*/
	
	}
		
	

