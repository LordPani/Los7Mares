package marineros;

/**
 * Esta clase es la de los capitanes pirata.
 * @author Sergio
 */

public class Capitan extends Pirata {
	
	private int pueblosAsaltados;
	private int islasDescubiertas;
	private int doblonesRobados;
	
	public Capitan(String nombre, int edad, String arma, String sombrero, String mascota, int pueblosAsaltos,
			int islasDescubiertas, int doblonesRobados) {
		super(nombre, edad, arma, sombrero, mascota);
		this.pueblosAsaltados = pueblosAsaltos;
		this.islasDescubiertas = islasDescubiertas;
		this.doblonesRobados = doblonesRobados;
	}

	public int getPueblosAsaltos() {
		return pueblosAsaltados;
	}

	public void setPueblosAsaltos(int pueblosAsaltos) {
		this.pueblosAsaltados = pueblosAsaltos;
	}

	public int getIslasDescubiertas() {
		return islasDescubiertas;
	}

	public void setIslasDescubiertas(int islasDescubiertas) {
		this.islasDescubiertas = islasDescubiertas;
	}

	public int getDoblonesRobados() {
		return doblonesRobados;
	}

	public void setDoblonesRobados(int doblonesRobados) {
		this.doblonesRobados = doblonesRobados;
	}
	
	/**
	 * Método que sirve para que un capitán pirata mande fregar a un subordinado.
	 * @param mandao El parámetro es un objeto de la clase Subordinado.
	 * @return Devuelve true o false dependiendo de si el "mandao" ha cumplido la tarea.
	 * @see #Subordinado.fregarCubierta()
	 */
	
	public boolean mandarAFregar(Subordinado mandao) {
		System.out.println("¡Tú, " + mandao.getApodo() + ", a fregar!");
		return mandao.fregarCubierta();
	}
	
	/**
	 * Método que sirve para que un capitán descubra una isla nueva.
	 * @param isla El nombre de la isla que ha encontrado.
	 */
	
	public void descubrirIsla (String isla) {
		System.out.println("¡Hemos hallado nuevas tierras! La isla se llamará " + isla);
	}
	
	/**
	 * Método que sirve para que un capitán asalte un pueblo y se lleve sus doblones.
	 * @param pueblo El nombre del pueblo asaltado.
	 * @param doblones El número de doblones que tiene el pueblo.
	 */
	
	public void asaltarPueblo (String pueblo, int doblones) {
		System.out.println("¡Arramblad con todo! ¡Nos quedamos con el oro de " + pueblo + "!");
		this.doblonesRobados += doblones;
		this.pueblosAsaltados++;
	}

	/**
	 * Método que sirve para que el capitán grite su rugido de guerra.
	 */
	@Override
	void rugidoPirata() {
		System.out.println("¡ARRRR! ¡Temerán nuestra bandera!");
		
	}

}
