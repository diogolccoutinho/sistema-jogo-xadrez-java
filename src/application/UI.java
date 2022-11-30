package application;

import xadrez.PecaXadrez;

public class UI {
	
	public static void exibeTabuleiro(PecaXadrez[][] pecas) {
		for (int i=0; i<pecas.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j=0; j<pecas.length; j++) {
				exibePeca(pecas[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
	}
	
	//Função auxiliar para imprimir a peça
	private static void exibePeca(PecaXadrez peca) {
		//Se não tiver peça exibe traço, se não mostra a peça
		if (peca == null) {
			System.out.print("-");
		} else {
			System.out.print(peca);
		}
		//Espaço entre as peças
		System.out.print(" ");
	}

}
