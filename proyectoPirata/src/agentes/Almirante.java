package agentes;

import marineros.Capitan;
import marineros.Pirata;
import marineros.Subordinado;

/**
 * Esta clase es la de los jefes de la Marina, los almirantes.
 * @author Sergio
 * @version 1.2
 */

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
	
	/**
	 * Metodo que sirve para que el almirante capture un pirata. Dependiendo del tipo capture, recibe o no una medalla de honor.
	 * @param preso Es el pirata que ha capturado.
	 * @return Devuelve el exito de la captura, que en este caso siempre es true.
	 * @since 1.0
	 * @see Pirata
	 * @see Justiciero#numMedallasHonor
	 */
	
	public boolean capturarPirata (Pirata preso) {
		if(preso instanceof Capitan) {
			System.out.println("¡He capturado al capitán enemigo! Seguro que era negro o gitano");
			numPiratasCapturados++;
			numMedallasHonor++;
			return true;
		}
		else if(preso instanceof Subordinado) {
			System.out.println("He pillado a un malandrín.");
			numPiratasCapturados++;
			return true;
		}
		else {
			return true;
		}
	}
	
	/**
	 * Metodo que sirve para que el almirante recorra los mares con su barco.
	 * @param millasARecorrer Son las millas que va a avanzar el barco.
	 * @return Devuelve las millas totales recorridas tras el viaje.
	 * @see #millasRecorridas
	 * @since 1.0
	 */
	public int avanzarBarco (int millasARecorrer) {
		System.out.println("¡Hora de impartir justicia! ¡Zarpamos con " + this.barcoQueDirige + "!");
		if(this.anyosExperiencia > 5) {
			this.millasRecorridas += millasARecorrer * 2;
		}
		else {
			this.millasRecorridas += millasARecorrer;
		}
		return this.millasRecorridas;
	}
	
	

}
