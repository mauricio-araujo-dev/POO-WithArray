package main;


public class Navio extends Veiculo{

	private String nome;
	private int numTripulantes;
	private String dataLancamento;
	

	public void entrada() {
		super.entrada();
		System.out.println("Nome: ");
		this.nome = sc.next();
		System.out.println("Número de Tripulantes: ");
		this.numTripulantes = sc.nextInt();
		System.out.println("Data de Lançamento: ");
		this.dataLancamento = sc.next();
		
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Nome: "+this.nome );
		System.out.println("Número de Tripulantes: "+this.numTripulantes + " tripulantes");
		System.out.println("Data de Lançamento: " + this.dataLancamento);		
		System.out.println("--- --- ---");
	}
	
	public int passageirosPorTripulantes() {
		int div = super.getNumPassageiros()/this.numTripulantes;
		System.out.println("Divisão de passageiros por tripulantes: "+div);
		return div;
	}
	
	
	// CINCO MÉTODOS CONSTRUTORES

	public Navio(int capacidadeTanque, int numPassageiros, double preco, String nome, int numTripulantes,
			String dataLancamento) {
		super(capacidadeTanque, numPassageiros, preco);
		this.nome = nome;
		this.numTripulantes = numTripulantes;
		this.dataLancamento = dataLancamento;
	}

	public Navio(int capacidadeTanque, int numPassageiros, double preco, String nome, int numTripulantes) {
		super(capacidadeTanque, numPassageiros, preco);
		this.nome = nome;
		this.numTripulantes = numTripulantes;
	}

	public Navio(int capacidadeTanque, int numPassageiros, double preco, int numTripulantes, String dataLancamento) {
		super(capacidadeTanque, numPassageiros, preco);
		this.numTripulantes = numTripulantes;
		this.dataLancamento = dataLancamento;
	}

	public Navio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Navio(int capacidadeTanque, int numPassageiros, double preco) {
		super(capacidadeTanque, numPassageiros, preco);
		// TODO Auto-generated constructor stub
	}
	
	
	
}
