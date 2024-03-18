package marineros;

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
	
	public boolean mandarAFregar(Subordinado mandao) {
		System.out.println("¡Tú, " + mandao.getApodo() + ", a fregar!");
		return mandao.fregarCubierta();
	}
	
	public void descubrirIsla (String isla) {
		System.out.println("¡Hemos hallado nuevas tierras! La isla se llamará " + isla);
	}
	
	public void asaltarPueblo (String pueblo, int doblones) {
		System.out.println("¡Arramblad con todo! ¡Nos quedamos con el oro de " + pueblo + "!");
		this.doblonesRobados += doblones;
		this.pueblosAsaltados++;
	}

	@Override
	void rugidoPirata() {
		System.out.println("¡ARRRR! ¡Temerán nuestra bandera!");
		
	}

}
