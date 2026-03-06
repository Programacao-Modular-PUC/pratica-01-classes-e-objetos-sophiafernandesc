package atividade01;

public class TrianguloRetangulo {

	private double c1;
	private double c2;
	private double h;

	public double getH() {
		return h;
	}

	public double getC1() {
		return c1;
	}

	public void setC1(double c1) {
		this.c1 = c1;
	}

	public double getC2() {
		return c2;
	}
	
	public void setC2(double c2) {
		this.c2 = c2;
	}

	public double calculaHipotenusa() {
		h = Math.sqrt((this.c1*this.c1) + (this.c2*this.c2));
		return this.h;	
	}
	
	public void mostraHipotenusa(double h) {
		System.out.println("O valor da hipotenusa é: " + h);
	}
	
	public double calculaArea() {
		return (this.c1 * this.c2) / 2;
	}
	
	public void mostraArea(double a) {
		System.out.println("O valor da área do triângulo é: " + a);
	}
	

}
