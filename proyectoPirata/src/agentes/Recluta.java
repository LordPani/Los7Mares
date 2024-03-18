package agentes;

public class Recluta extends Justiciero {
	
	private String gorro;
	private int anclasEchadas;
	
	public Recluta(String nombre, int edad, int anyosExperiencia, String punteria, int numMedallasHonor, String gorro,
			int anclasEchadas) {
		super(nombre, edad, anyosExperiencia, punteria, numMedallasHonor);
		this.gorro = gorro;
		this.anclasEchadas = anclasEchadas;
	}

	public String getGorro() {
		return gorro;
	}

	public void setGorro(String gorro) {
		this.gorro = gorro;
	}

	public int getAnclasEchadas() {
		return anclasEchadas;
	}

	public void setAnclasEchadas(int anclasEchadas) {
		this.anclasEchadas = anclasEchadas;
	}
	
	
	
	
	
	
}
