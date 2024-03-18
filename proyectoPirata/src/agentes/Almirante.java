package agentes;

public class Almirante extends Justiciero {
	
	private int numPiratasCapturados;
	private String barcoQueDirige;
	
	public Almirante(String nombre, int edad, int anyosExperiencia, String punteria, int numMedallasHonor,
			int numPiratasCapturados, String barcoQueDirige) {
		super(nombre, edad, anyosExperiencia, punteria, numMedallasHonor);
		this.numPiratasCapturados = numPiratasCapturados;
		this.barcoQueDirige = barcoQueDirige;
	}

	public int getNumPiratasCapturados() {
		return numPiratasCapturados;
	}

	public void setNumPiratasCapturados(int numPiratasCapturados) {
		this.numPiratasCapturados = numPiratasCapturados;
	}

	public String getBarcoQueDirige() {
		return barcoQueDirige;
	}

	public void setBarcoQueDirige(String barcoQueDirige) {
		this.barcoQueDirige = barcoQueDirige;
	}
	
	
	
	
	

}
