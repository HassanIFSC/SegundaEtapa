package proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyVerificaFilme implements Locacao {
	private Locacao locacao = new FilmePermitido();
	private static List<String> filmesRestritos;

	static {
		filmesRestritos = new ArrayList<String>();
		filmesRestritos.add("Scarface (1983)");
		filmesRestritos.add("Pulp Fiction: Tempo de Violência (1994)");
		filmesRestritos.add("O Poderoso Chefão (1972)");
		filmesRestritos.add("Warriors - Os Selvagens da Noite (1979)");
	}

	@Override
	public void alugando(String filme) throws Exception {
		if (filmesRestritos.contains(filme)) {
			throw new Exception(filme + " não é recomendado pra esta faixa etária.");
		}

		locacao.alugando(filme);
	}

}