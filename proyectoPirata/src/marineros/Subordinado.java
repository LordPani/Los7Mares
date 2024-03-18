package marineros;

/**
 * Esta clase es la de los subordinados de los capitanes.
 * @author Sergio
 */

public class Subordinado extends Pirata {
	
	private String apodo;
	private int cubiertasFregadas;
	private int numCanyonAsignado;
	private int motivacion;
	
	public Subordinado(String nombre, int edad, String arma, String sombrero, String mascota, String apodo,
			int cubiertasFregadas, int numCanyonAsignado, int motivacion) {
		super(nombre, edad, arma, sombrero, mascota);
		this.apodo = apodo;
		this.cubiertasFregadas = cubiertasFregadas;
		this.numCanyonAsignado = numCanyonAsignado;
		this.motivacion = motivacion;
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
	
	/**
	 * Método que sirve para que un subordinado friegue una cubierta. El éxito dependerá de su motivación.
	 * @return Devuelve el éxito de la tarea de fregar la cubierta.
	 */
	
	public boolean fregarCubierta (){
		boolean fregada = false;
		System.out.println("Esto no está limpio ni dos días seguidos...");
		if(this.motivacion < 5) {
			System.out.println("No doy abasto...");
			fregada = false;
		}
		else {
			System.out.println("Venga, lo voy a dejar como los chorros del oro.");
			fregada = true;
		}
		this.cubiertasFregadas++;
		return fregada;
	}

	/**
	 * Método que sirve para que el subordinado grite su rugido de guerra.
	 */
	
	@Override
	void rugidoPirata() {
		System.out.println("¡Por el oro, no por la gloria!");
	}
	
	/**
	 * Método que sirve para que el subordinado dispare el cañón que tiene asignado.
	 */
	
	public void dispararCanyon() {
		System.out.println("¡Voy al cañón " + this.numCanyonAsignado + "! ¡A disparar!");
	}
		
	

}
