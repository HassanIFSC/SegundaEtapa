package decorador;

public class BluRay implements Formato {

	@Override
	public void especificar() {
		System.out.println("Formato: Blu-ray");
	}
}