package decorador;

public class ResolucaoFHD extends EspecificadorForm {

	public ResolucaoFHD(Formato formatoEspecificado) {
		super(formatoEspecificado);
	}

	@Override
	public void especificar() {
		formatoEspecificado.especificar();
		setResolucaoFHD(formatoEspecificado);
	}

	private void setResolucaoFHD(Formato formatoEspecificado) {
		System.out.println("Resolução: FHD");
	}
}