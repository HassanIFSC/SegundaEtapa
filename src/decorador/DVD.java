package decorador;

public class DVD implements Formato {

	@Override
	public void especificar() {
		System.out.println("Formato: DVD");
	}
}