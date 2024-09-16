package main;

import java.util.InputMismatchException;

public class Aviao extends Veiculo {
	
	private String prefixo;
	private String dataRevisao;
	
	// MÉTODO ENTRADA
	
	public void entrada(){
		super.entrada();
		System.out.println("Prefixo: ");
		this.prefixo = sc.next();
		System.out.println("Data de Revisão: ");		
		this.dataRevisao = sc.next();
	}
	
	// MÉTODO IMPRIMIR 
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Prefixo: "+this.prefixo);
		System.out.println("Data de Revisão: "+this.dataRevisao);
	}

	
	// MÉTODO REAJUSTAR PREÇO
	
	public double reajustarPreco(double percent) {
		
		int decisao;
		double preco = this.getPreco();
		
		System.out.println("---> Reajuste de Preço :");
		System.out.println("1- Aumentar");
		System.out.println("2- Diminuir");
		System.out.println("Digite uma das opções acima para prosseguir");
		
		
		while (true) {
            System.out.print("Digite uma opção: ");
            try {
                decisao = sc.nextInt();
                if (decisao < 0 && decisao > 2) {
                    throw new IllegalArgumentException("Entrada inválida. Por favor, digite uma opção válida.");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
                sc.next(); 
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
		
		System.out.println("Valor antes do reajuste: R$"+preco);
		
		if (decisao == 1) {
			preco = preco + ((percent/100) * preco) ;
		}else if (decisao == 2) {
			preco = preco - ((percent/100) * preco) ;
		}else {
			System.out.println("Número inválido, por favor escolha um número válido.");
		}
				
		System.out.println("Percentual do reajuste: "+percent+"%");
		
		System.out.println("Valor depois do reajuste: R$"+preco);
		
		return percent;
	}
	
	// MÉTODOS CONSTUTORES
	
	public Aviao(String prefixo, String dataRevisao) {
		super();
		this.prefixo = prefixo;
		this.dataRevisao = dataRevisao;
	}

	public Aviao() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aviao(int capacidadeTanque, int numPassageiros, double preco) {
		super(capacidadeTanque, numPassageiros, preco);
		// TODO Auto-generated constructor stub
	}

	public Aviao(int capacidadeTanque, int numPassageiros, double preco, String prefixo, String dataRevisao) {
		super(capacidadeTanque, numPassageiros, preco);
		this.prefixo = prefixo;
		this.dataRevisao = dataRevisao;
	}
	
	
}