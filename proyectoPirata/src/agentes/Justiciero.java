package agentes;

public abstract class Justiciero {
	
	protected String nombre;
	protected int edad;
	protected int anyosExperiencia;
	protected String punteria;
	protected int numMedallasHonor;
	
	protected Justiciero(String nombre, int edad, int anyosExperiencia, String punteria, int numMedallasHonor) {
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

	public String getPunteria() {
		return punteria;
	}

	public void setPunteria(String punteria) {
		this.punteria = punteria;
	}

	public int getNumMedallasHonor() {
		return numMedallasHonor;
	}

	public void setNumMedallasHonor(int numMedallasHonor) {
		this.numMedallasHonor = numMedallasHonor;
	}
	
	
	
	

}
