package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.King;
import xadrez.pecas.Torre;

public class PartidaXadrez {

	private Tabuleiro tabuleiro;
	
	//A classe jogo tem que saber o tamanho do tabuleiro
	public PartidaXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		configInicial();
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
	
	private void configInicial() {
		tabuleiro.lugarPeca(new Torre(tabuleiro, Cor.BRANCO), new Posicao(2, 1));
		tabuleiro.lugarPeca(new King(tabuleiro, Cor.PRETO), new Posicao(0, 4));
		tabuleiro.lugarPeca(new King(tabuleiro, Cor.PRETO), new Posicao(7, 4));
	}
	
}
