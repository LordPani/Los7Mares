package marineros;

public class Capitan extends Pirata {

	private int pueblosAsaltos;
	private int islasDescubiertas;
	private int doblonesRobados;
	
	public Capitan(String nombre, int edad, String arma, String sombrero, String mascota, int pueblosAsaltos,
			int islasDescubiertas, int doblonesRobados) {
		super(nombre, edad, arma, sombrero, mascota);
		this.pueblosAsaltos = pueblosAsaltos;
		this.islasDescubiertas = islasDescubiertas;
		this.doblonesRobados = doblonesRobados;
	}

	public int getPueblosAsaltos() {
		return pueblosAsaltos;
	}

	public void setPueblosAsaltos(int pueblosAsaltos) {
		this.pueblosAsaltos = pueblosAsaltos;
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
	
	

}
