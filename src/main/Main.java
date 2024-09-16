package main;

public class Main {

	public static void main(String[] args) {
		
		
		Aviao[] vetorAviao = new Aviao[1];
        Navio[] vetorNavio = new Navio[10];
        
        for (int i = 0; i < vetorAviao.length; i++) {
            vetorAviao[i] = new Aviao();
            vetorAviao[i].entrada();
            vetorAviao[i].imprimir();
        }
        
        for (int i = 0; i < vetorNavio.length; i++) {
            vetorNavio[i] = new Navio();
            vetorNavio[i].entrada();
            vetorNavio[i].imprimir();
            vetorNavio[i].passageirosPorTripulantes();
        }
        
        
        vetorAviao[0].reajustarPreco(20);
	}
}