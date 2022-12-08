package fabrica;

public class FabricaDeNotificacoes {
	public Notificacao novaNotificacao(String comunicacao) {
		if (comunicacao == null || comunicacao.isEmpty())
			return null;
		switch (comunicacao) {
		case "TEL":
			return new Telefone();
		case "EMAIL":
			return new Email();
		case "ZAP":
			return new Zapzap();
		default:
			throw new IllegalArgumentException(comunicacao + "é um meio de comunicação desconhecido.");
		}
	}
}