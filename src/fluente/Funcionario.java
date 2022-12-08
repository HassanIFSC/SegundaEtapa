package fluente;

public class Funcionario {
	private String nome;
	private String dataNascimento;
	private Funcao funcao;
	private Turno turno;

	public Funcionario eChamado(String nome) {
		this.nome = nome;
		return this;
	}

	public Funcionario nasceuEm(String dataNascimento) {
		this.dataNascimento = dataNascimento;
		return this;
	}

	public Funcionario eUm(Funcao funcao) {
		this.funcao = funcao;
		return this;
	}

	public Funcionario trabalhaNo(Turno turno) {
		this.turno = turno;
		return this;
	}

	public String chamado() {
		return nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public String getNome() {
		return nome;
	}

	public Turno getTurno() {
		return turno;
	}

}