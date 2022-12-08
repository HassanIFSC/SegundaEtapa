package proxy;

public class ClienteDe15Anos {
	public static void main(String[] args) {
		Locacao locacao = new ProxyVerificaFilme();
		try {
			locacao.alugando("Homem de Ferro (2008)");
			locacao.alugando("Scarface (1983)");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}