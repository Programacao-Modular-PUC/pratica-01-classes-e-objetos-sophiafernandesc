package atividade02;

public class Pessoa {
	
	private String nome;
	private String sobrenome;
	private int idade;
	private double altura;
	private double peso;
	private double imc;
	
	public Pessoa(String nome, String sobrenome, int idade, double altura, double peso, double imc) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.imc = imc;
	}

	public Pessoa() {
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getImc() {
		return imc;
	}

	public double calculaIMC() {
		imc = this.peso / (Math.pow(this.altura, 2));
		return this.imc; 
	}
	
	public void informaObesidade() {
		System.out.printf("Faixa de massa corporal: ");
		if (this.imc < 18.5) {
	        System.out.println("Abaixo do peso");
	    } 
	    else if (this.imc < 25.0) { 
	        System.out.println("Peso normal");
	    } 
	    else if (this.imc < 30.0) {
	        System.out.println("Sobrepeso");
	    } 
	    else if (this.imc < 35.0) {
	        System.out.println("Obesidade grau 1");
	    } 
	    else if (this.imc < 40.0) {
	        System.out.println("Obesidade grau 2");
	    } 
	    else { 
	        System.out.println("Obesidade grau 3");
	    }
	}
	
}
