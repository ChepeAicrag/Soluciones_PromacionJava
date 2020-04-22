import java.util.List;

public class Casa  {
	private String tipoDeCasa;
	private int cantidadDeMascotas;// la cantidad de animales que pueden entrar en la casa
	private List <mascota> mascota;
		public Casa( String tipoDeCasa,int cantidadDeMascotas, List <mascota> mascota) {
		this.tipoDeCasa=tipoDeCasa;
		this.cantidadDeMascotas=cantidadDeMascotas;
		this.mascota=mascota;
		}
	public String toString(){
		return "- Tipo de casa: "+tipoDeCasa+ "-  Cantidad de Mascotas que entran en la casa: "+ cantidadDeMascotas;
		
	}
	public String getTipoDeCasa() {
		return tipoDeCasa;
	}
	public void setTipoDeCasa(String tipoDeCasa) {
		this.tipoDeCasa = tipoDeCasa;
	}
	public int getCantidadDeMascotas() {
		return cantidadDeMascotas;
	}
	public void setCantidadDeMascotas(int cantidadDeMascotas) {
		this.cantidadDeMascotas = cantidadDeMascotas;
	}
	public List<mascota> getMascota() {
		return mascota;
	}
	public void setMascota(List<mascota> mascota) {
		this.mascota = mascota;
		if(mascota.size()<cantidadDeMascotas){
			 if(((mascota) mascota).getCasa().equals(this.getTipoDeCasa())) {
			 this.mascota.addAll(mascota);
			}}}}
