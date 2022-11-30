package application;

import xadrez.PartidaXadrez;

public class ProgramJogoXadrez {

	public static void main(String[] args) {
		
		PartidaXadrez jogo = new PartidaXadrez();
		UI.exibeTabuleiro(jogo.getPecas());

	}

}
