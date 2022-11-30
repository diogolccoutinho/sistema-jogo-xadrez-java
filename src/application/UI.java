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
	
	//Fun��o auxiliar para imprimir a pe�a
	private static void exibePeca(PecaXadrez peca) {
		//Se n�o tiver pe�a exibe tra�o, se n�o mostra a pe�a
		if (peca == null) {
			System.out.print("-");
		} else {
			System.out.print(peca);
		}
		//Espa�o entre as pe�as
		System.out.print(" ");
	}

}
