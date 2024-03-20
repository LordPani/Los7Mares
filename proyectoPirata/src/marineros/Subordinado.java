package marineros;

/**
 * Esta clase es la de los subordinados de los capitanes.
 * @author Sergio
 * @version 1.2
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
	 * Metodo que sirve para que un subordinado friegue una cubierta. El exito depende de su motivacion.
	 * @return Devuelve el éxito de la tarea de fregar la cubierta.
	 * @see #motivacion
	 * @since 1.0
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
	 * @since 1.0
	 */
	
	@Override
	void rugidoPirata() {
		System.out.println("¡Por el oro, no por la gloria!");
	}
	
	/**
	 * Metodo que sirve para que el subordinado dispare el cañon que tiene asignado.
	 * @since 1.0
	 * @deprecated Desde la version 1.1, reemplazado por {@link #dispararCanyonPorCircunstancia(int)}
	 */
	
	public void dispararCanyon() {
		System.out.println("¡Voy al cañón " + this.numCanyonAsignado + "! ¡A disparar!");
	}
	
	/**
	 * Metodo que sirve para que el subordinado dispare el cañon que tiene asignado. El pirata dice una cosa u otra dependiendo de la fuerza del viento.
	 * @since 1.1
	 * @param potenciaViento La fuerza con la que sopla el viento, que asusta al pirata porque influye en la precision del disparo.
	 * @see #numCanyonAsignado
	 */
	
	public void dispararCanyonPorCircunstancia (int potenciaViento) {
		if (potenciaViento < 10) {
			System.out.println("¡Voy al cañón " + this.numCanyonAsignado + "! ¡Seguro que no fallo!");
		}
		else if (potenciaViento > 10 && potenciaViento < 30) {
			System.out.println("¡Voy a disparar el cañón " + this.numCanyonAsignado + ", pero hace viento y quizá se me vaya!");
		}
		else {
			System.out.println("¡Abro fuego con el cañón " + this.numCanyonAsignado + ", pero seguro que fallo, que hay un vendaval!");
		}
	}
		
	

}
