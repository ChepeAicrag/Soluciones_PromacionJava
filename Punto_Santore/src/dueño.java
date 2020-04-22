import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class dueño{
	private String Dueño;
	private Set <mascota> mascotas;
        private Casa tipoCasa;
	public dueño(String Dueño,Casa tipoCasa){
		this.Dueño=Dueño;
                this.tipoCasa = tipoCasa;
		mascotas = new HashSet<>();
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
        
        public Casa getTipoDeCasa(){
            return tipoCasa;
        }
	public void setMascotas(mascota m) {
		if(mascotas.size()<this.getTipoDeCasa().getCantidadDeMascotas()){
                    if(m.getCasa().equals(this.getTipoDeCasa())){
                        this.mascotas.add(m);
                    }
                }
	}	

}
