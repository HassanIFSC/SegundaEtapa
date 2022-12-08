package fabrica;

public class Email implements Notificacao {

	@Override
	public void notificarCliente() {
		System.out.println("Enviando um email para o cliente...");
	}
}