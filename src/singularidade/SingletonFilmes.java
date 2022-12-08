package singularidade;

public class SingletonFilmes {
	public static void main(String[] args) {

		ColetaneaUnica filmes = ColetaneaUnica.getUnica();

		filmes.mostrar4Filmes();
	}
}