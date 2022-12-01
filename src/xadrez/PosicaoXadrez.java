package xadrez;

import tabuleiro.Posicao;

public class PosicaoXadrez {

	private char coluna;
	private int linha;
	
	public PosicaoXadrez(char coluna, int linha) {
		if (coluna < 'a' || coluna > 'h' || linha < 1 || linha > 8) {
			throw new XadrezException("Erro ao instanciar a posi��o. Valores v�lidos s�o de a1 at� h8.");
		}
		this.coluna = coluna;
		this.linha = linha;
	}

	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}

	//convertendo os caracteres passados pelos jogadores para a matrix do tabuleiro
	protected Posicao paraPosicao() {
		return new Posicao(8 - linha, coluna - 'a');
	}
	
	//Caminho inverso, matrix para jogadores
	protected static PosicaoXadrez dePosicao(Posicao posicao) {
		return new PosicaoXadrez((char)('a' - posicao.getColuna()), 8 - posicao.getColuna());
	}

	@Override
	public String toString() {
		//OS "" sevem para fazer o complipador concatenar as vari�veis
		return "" + coluna + linha;
	}
	
	
	
}
