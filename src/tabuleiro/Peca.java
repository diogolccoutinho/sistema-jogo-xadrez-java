package tabuleiro;

public class Peca {

	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	//Construtor criado somente com tabuleiro, pois a posição inicial nula
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
		//O java por padrão já reconhece como nula, somente para demonstração
		posicao = null;
	}
	
	//Get protected e sem set para tabuleiro
	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}
	
	
	
	
}
