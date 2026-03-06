package atividade02;

import java.util.Scanner;

public class TestePessoa {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Digite o nome: ");
		pessoa.setNome(sc.nextLine());
		
		System.out.println("Digite o sobrenome: ");
		pessoa.setSobrenome(sc.nextLine());
		
		System.out.println("Digite a idade: ");
		pessoa.setIdade(sc.nextInt());
		
		System.out.println("Digite a altura: ");
		pessoa.setAltura(sc.nextDouble());
		
		System.out.println("Digite o peso: ");
		pessoa.setPeso(sc.nextDouble());
		
		pessoa.calculaIMC();
		System.out.println("Nome: " + pessoa.getNome()+ "\n" + "Sobrenome: " + pessoa.getSobrenome() + "\n" + "Idade: " + pessoa.getIdade() + "\n" + "Altura: " + pessoa.getAltura() + "\n" + "Peso: " + pessoa.getPeso());
		System.out.println("O IMC é: " + pessoa.getImc());
		pessoa.informaObesidade();
		
		
	}
	

}
