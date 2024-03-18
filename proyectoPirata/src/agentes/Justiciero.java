package agentes;

/**
 * Esta clase es la superclase de los agentes miembros de la Marina.
 * @author Sergio
 */

public abstract class Justiciero {
	
	protected String nombre;
	protected int edad;
	protected int anyosExperiencia;
	protected int punteria;
	protected int numMedallasHonor;
	
	protected Justiciero(String nombre, int edad, int anyosExperiencia, int punteria, int numMedallasHonor) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.anyosExperiencia = anyosExperiencia;
		this.punteria = punteria;
		this.numMedallasHonor = numMedallasHonor;
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

	public int getAnyosExperiencia() {
		return anyosExperiencia;
	}

	public void setAnyosExperiencia(int anyosExperiencia) {
		this.anyosExperiencia = anyosExperiencia;
	}

	public int getPunteria() {
		return punteria;
	}

	public void setPunteria(int punteria) {
		this.punteria = punteria;
	}

	public int getNumMedallasHonor() {
		return numMedallasHonor;
	}

	public void setNumMedallasHonor(int numMedallasHonor) {
		this.numMedallasHonor = numMedallasHonor;
	}
	
	
	
	

}
