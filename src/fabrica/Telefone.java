package fabrica;

public class Telefone implements Notificacao {

	@Override
	public void notificarCliente() {
		System.out.println("Telefonando para o cliente...");
	}
}