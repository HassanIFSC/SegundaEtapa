package fabrica;

public class ServicoDeNotificacoes {
	public static void main(String[] args) {
		FabricaDeNotificacoes fabricaNotificacoes = new FabricaDeNotificacoes();
		Notificacao notificationTEL = fabricaNotificacoes.novaNotificacao("TEL");
		Notificacao notificationEMAIL = fabricaNotificacoes.novaNotificacao("EMAIL");
		Notificacao notificationZAP = fabricaNotificacoes.novaNotificacao("ZAP");
		notificationTEL.notificarCliente();
		notificationEMAIL.notificarCliente();
		notificationZAP.notificarCliente();
	}
}