package main;

import java.util.Scanner;

public class Veiculo {

	private int capacidadeTanque;
	private int numPassageiros;
	private double preco;
	
	Scanner sc = new Scanner(System.in);
	
	// MÉTODO ENTRADA
	
	public void entrada() {
		System.out.println("-- Entrada de Dados -- ");
		System.out.println("Capacidade do tanque: ");
		this.capacidadeTanque = sc.nextInt();
		System.out.println("Numero de Passageiros: ");
		this.numPassageiros = sc.nextInt();
		System.out.println("Preço: R$ ");
		this.preco = sc.nextDouble();
	}
	
	// MÉTODO IMPRIMIR
	
	public void imprimir() {
		System.out.println("--- Dados do Veículo ---");
		System.out.println("Capacidade do Tanque: "+this.capacidadeTanque + " litros");
		System.out.println("Número de passageiros: "+this.numPassageiros + " passageiros");
		System.out.println("Preço: R$" + this.preco);
	}


	// GETTERS AND SETTERS
	
	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public void setNumPassageiros(int numPassageiros) {
		this.numPassageiros = numPassageiros;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	
	// DOIS METODOS CONSTRUTORES

	public Veiculo(int capacidadeTanque, int numPassageiros, double preco) {
		super();
		this.capacidadeTanque = capacidadeTanque;
		this.numPassageiros = numPassageiros;
		this.preco = preco;
	}
	
	
	public Veiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
}
