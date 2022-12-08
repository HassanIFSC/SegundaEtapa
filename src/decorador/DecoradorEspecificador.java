package decorador;

public class DecoradorEspecificador {

	public static void main(String[] args) {
		Formato dvd = new DVD();

		Formato bluray = new BluRay();

		Formato dvdSD = new ResolucaoSD(new DVD());

		Formato blurayFHD = new ResolucaoFHD(new BluRay());

		System.out.println("Tipos de m�dia da locadora:");

		dvd.especificar();
		bluray.especificar();

		System.out.println("\nUm DVD e a sua resolu��o:");

		dvdSD.especificar();

		System.out.println("\nUm Blu-ray e a sua resolu��o:");

		blurayFHD.especificar();
	}
}