package marineros;

public class Subordinado extends Pirata {
	
	private String apodo;
	private int cubiertasFregadas;
	private int numCanyonAsignado;
	
	public Subordinado(String nombre, int edad, String arma, String sombrero, String mascota, String apodo,
			int cubiertasFregadas, int numCanyonAsignado) {
		super(nombre, edad, arma, sombrero, mascota);
		this.apodo = apodo;
		this.cubiertasFregadas = cubiertasFregadas;
		this.numCanyonAsignado = numCanyonAsignado;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public int getCubiertasFregadas() {
		return cubiertasFregadas;
	}

	public void setCubiertasFregadas(int cubiertasFregadas) {
		this.cubiertasFregadas = cubiertasFregadas;
	}

	public int getNumCanyonAsignado() {
		return numCanyonAsignado;
	}

	public void setNumCanyonAsignado(int numCanyonAsignado) {
		this.numCanyonAsignado = numCanyonAsignado;
	}
	
	
	
	
	

}
