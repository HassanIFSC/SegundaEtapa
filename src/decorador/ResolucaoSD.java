package decorador;

public class ResolucaoSD extends EspecificadorForm {

	public ResolucaoSD(Formato formatoEspecificado) {
		super(formatoEspecificado);
	}

	@Override
	public void especificar() {
		formatoEspecificado.especificar();
		setResolucaoSD(formatoEspecificado);
	}

	private void setResolucaoSD(Formato formatoEspecificado) {
		System.out.println("Resolução: SD");
	}
}