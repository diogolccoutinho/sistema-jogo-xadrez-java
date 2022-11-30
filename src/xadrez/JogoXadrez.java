package xadrez;

import tabuleiro.Tabuleiro;

public class JogoXadrez {

	private Tabuleiro tabuleiro;
	
	//A classe jogo tem que saber o tamanho do tabuleiro
	public JogoXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
	}
	
	//Retorna a matrix de peças a partir da camada xadrez sem acesso a tabuleiro
	public PecaXadrez[][] getPecas() {
		PecaXadrez[][] matrix = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i=0; i<tabuleiro.getLinhas(); i++) {
			for (int j=0; j<tabuleiro.getColunas(); j++) {
				matrix[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
			}
		}
		return matrix;
	}
	
}
