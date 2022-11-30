package tabuleiro;

public class Peca {

	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	//Construtor criado somente com tabuleiro, pois a posi��o inicial nula
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		//O java por padr�o j� reconhece como nula, somente para demonstra��o
		posicao = null;
	}
	
	//Get protected e sem set para tabuleiro
	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	
	
	
}
