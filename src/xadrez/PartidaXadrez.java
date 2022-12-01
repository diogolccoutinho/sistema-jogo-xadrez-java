package xadrez;

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
	
	private void colocarNovaPeca(char coluna, int linha, PecaXadrez peca) {
		tabuleiro.lugarPeca(peca, new PosicaoXadrez(coluna, linha).paraPosicao());
	}
	
	private void configInicial() {
		colocarNovaPeca('b', 6, new Torre(tabuleiro, Cor.BRANCO));
		colocarNovaPeca('e', 8, new King(tabuleiro, Cor.PRETO));
		colocarNovaPeca('e', 1, new King(tabuleiro, Cor.BRANCO));
	}
	
}
