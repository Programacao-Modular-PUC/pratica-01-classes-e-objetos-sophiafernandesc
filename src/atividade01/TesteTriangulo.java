package atividade01;

import java.util.Scanner;

public class TesteTriangulo {
	
	public static void main(String[] args) {
		
		TrianguloRetangulo t1 = new TrianguloRetangulo();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do Cateto 1: ");
		t1.setC1(sc.nextDouble());
		System.out.println("Digite o valor do Cateto 2: ");
		t1.setC2(sc.nextDouble());
		
		t1.calculaHipotenusa();
		System.out.println("O valor da área do triângulo é: " + t1.calculaArea());
		System.out.println("O valor da hipotenusa é: " + t1.getH());
	}
	
}
