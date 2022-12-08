package fachada;

public class BancoDeDados {

	public static void main(String[] args) {
		InsersorDeGeneros insersor = new InsersorDeGeneros();
		insersor.insiraAcao();
		insersor.insiraDrama();
		insersor.insiraTerror();
		insersor.insiraComedia();
	}

}