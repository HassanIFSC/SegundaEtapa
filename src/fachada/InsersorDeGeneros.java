package fachada;

public class InsersorDeGeneros {
	private Genero acao;
	private Genero drama;
	private Genero terror;
	private Genero comedia;

	public InsersorDeGeneros() {
		acao = new Acao();
		drama = new Drama();
		terror = new Terror();
		comedia = new Comedia();
	}

	public void insiraAcao() {
		acao.insira();
	}

	public void insiraDrama() {
		drama.insira();
	}

	public void insiraTerror() {
		terror.insira();
	}
	
	public void insiraComedia() {
		comedia.insira();
	}
}