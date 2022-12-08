package proxy;

public class FilmePermitido implements Locacao {
	@Override
	public void alugando(String filme) {
		System.out.println("O filme alugado é " + filme);
	}
}