package decorador;

public abstract class EspecificadorForm implements Formato {

	protected Formato formatoEspecificado;

	public EspecificadorForm(Formato formatoEspecificado) {

		this.formatoEspecificado = formatoEspecificado;
	}

	public void especificar() {
		formatoEspecificado.especificar();
	}
}