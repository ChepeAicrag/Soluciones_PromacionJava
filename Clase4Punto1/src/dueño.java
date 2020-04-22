import java.util.List;
import java.util.Set;

public class dueño {
	private String Dueño;
	private Set <mascota> mascotas;
	
	public dueño(String Dueño){
		this.Dueño=Dueño;
		this.mascotas=Set.of();
		}
		public String toString(){
		return "Dueño/a: " + Dueño;
		}
		public String getDuenio() {
		return Dueño;
	}
	public void setDuenio(String dueño) {
		Dueño = dueño;
	}
	public Set<mascota> getMascotas() {
		return mascotas;
	}
	public void setMascotas(Set<mascota> mascotas) {
		this.mascotas = mascotas;
	}	
	}
