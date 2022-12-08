package fabrica;

public class Zapzap implements Notificacao {

	@Override
	public void notificarCliente() {
		System.out.println("Enviando uma mensagem para o cliente...");
	}
}