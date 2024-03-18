package marineros;

/**
 * Esta clase es la superclase que engloba a los capitanes piratas con sus subordinados.
 * @author Sergio
 */

public abstract class Pirata {
	
	protected String nombre;
	protected int edad;
	protected String arma;
	protected String sombrero;
	protected String mascota;
	
	protected Pirata(String nombre, int edad, String arma, String sombrero, String mascota) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.arma = arma;
		this.sombrero = sombrero;
		this.mascota = mascota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getArma() {
		return arma;
	}

	public void setArma(String arma) {
		this.arma = arma;
	}

	public String getSombrero() {
		return sombrero;
	}

	public void setSombrero(String sombrero) {
		this.sombrero = sombrero;
	}

	public String getMascota() {
		return mascota;
	}

	public void setMascota(String mascota) {
		this.mascota = mascota;
	}
	
	/**
	 * Este método abstracto es diferente según el tipo de pirata.
	 */
	abstract void rugidoPirata();
	
	
	
	

}
