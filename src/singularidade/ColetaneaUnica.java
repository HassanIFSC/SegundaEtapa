package singularidade;

import java.util.Random;

public class ColetaneaUnica {

	private static ColetaneaUnica unica = new ColetaneaUnica();

	private ColetaneaUnica() {
	}

	public static ColetaneaUnica getUnica() {
		return unica;
	}

	public void mostrar4Filmes() {

		String[] filmesBR = { "Cidade de Deus", "Tropa de Elite", "O Auto da Compadecida", "Central do Brasil",
				"Minha Mãe é Uma Peça", "Divaldo - O Mensageiro da Paz", "Tim Maia",
				"Carlota Joaquina, Princesa do Brazil" };

		String[] subtitulos = { ": o Retorno", ": a Vingança", ": a Maldição", ": Reloaded", ": Ressurreição",
				" vs. o Mundo", " vs. Jason", " vs. Predador" };

		Random random = new Random();
		for (int i = 0; i < 4; i++) {
			int indexS = random.nextInt(subtitulos.length);
			int indexF = random.nextInt(filmesBR.length);
			System.out.printf(filmesBR[indexF] + subtitulos[indexS] + "\n");
		}
	}
}