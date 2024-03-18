package agentes;

import marineros.Capitan;
import marineros.Pirata;
import marineros.Subordinado;

public class Almirante extends Justiciero {
	
	private int numPiratasCapturados;
	private String barcoQueDirige;
	private int millasRecorridas;
	
	public Almirante(String nombre, int edad, int anyosExperiencia, int punteria, int numMedallasHonor,
			int numPiratasCapturados, String barcoQueDirige, int millasRecorridas) {
		super(nombre, edad, anyosExperiencia, punteria, numMedallasHonor);
		this.numPiratasCapturados = numPiratasCapturados;
		this.barcoQueDirige = barcoQueDirige;
		this.millasRecorridas = millasRecorridas;
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
	
	public void capturarPirata (Pirata preso) {
		if(preso instanceof Capitan) {
			System.out.println("¡He capturado al capitán enemigo!");
			numPiratasCapturados++;
			numMedallasHonor++;
		}
		else if(preso instanceof Subordinado) {
			System.out.println("He pillado a un malandrín.");
			numPiratasCapturados++;
		}
	}
	
	public int avanzarBarco (int millasARecorrer) {
		System.out.println("¡Hora de impartir justicia! ¡Zarpamos con " + this.barcoQueDirige + "!");
		this.millasRecorridas += millasARecorrer;
		return this.millasRecorridas;
	}
	
	

}
