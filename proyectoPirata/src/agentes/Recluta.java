package agentes;

public class Recluta extends Justiciero {
	
	private String colorGorro;
	private int anclasEchadas;
	
	public Recluta(String nombre, int edad, int anyosExperiencia, int punteria, int numMedallasHonor, String gorro,
			int anclasEchadas) {
		super(nombre, edad, anyosExperiencia, punteria, numMedallasHonor);
		this.colorGorro = gorro;
		this.anclasEchadas = anclasEchadas;
	}

	public String getGorro() {
		return colorGorro;
	}

	public void setGorro(String gorro) {
		this.colorGorro = gorro;
	}

	public int getAnclasEchadas() {
		return anclasEchadas;
	}

	public void setAnclasEchadas(int anclasEchadas) {
		this.anclasEchadas = anclasEchadas;
	}
	
	public int echarAncla() {
		System.out.println("¡Voy a echar el ancla! ¡Vamos a frenar!");
		anclasEchadas++;
		if(this.anclasEchadas > 51) {
			numMedallasHonor++;
		}
		return this.anclasEchadas;
	}
	
	public void ponerseGorro() {
		System.out.println("Me voy a poner mi gorro de color " + colorGorro);
		if(colorGorro.equalsIgnoreCase("verde")) {
			this.punteria += 7;
		}
		else if(colorGorro.equalsIgnoreCase("morado")) {
			this.punteria += 2;
		}
		else {
			this.punteria++;
		}
		
	}
	
	
}
