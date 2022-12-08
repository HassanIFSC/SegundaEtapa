package fluente;

public class Funcao {
	private String nome;

	public String getNome() {
		return nome;
	}

	public Funcao suaFuncao(String funcao) {
		this.nome = funcao;
		return this;
	}
}