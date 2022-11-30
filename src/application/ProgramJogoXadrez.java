package application;

import tabuleiro.Tabuleiro;
import xadrez.JogoXadrez;

public class ProgramJogoXadrez {

	public static void main(String[] args) {
		
		JogoXadrez jogo = new JogoXadrez();
		UI.exibeTabuleiro(jogo.getPecas());

	}

}
