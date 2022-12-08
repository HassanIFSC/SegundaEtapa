package fluente;

public class Main {

	public static void main(String[] args) {
		Funcao caixa = new Funcao().suaFuncao("caixa da locadora");
		Turno matutino = new Turno().seuTurno("trabalha no per�odo da manh�");
		Funcionario joao = new Funcionario().eChamado("Jo�o").nasceuEm("09/11/2001").eUm(caixa).trabalhaNo(matutino);
		System.out.println(joao.chamado() + ", nascido em " + joao.getDataNascimento() + ", " + matutino.getHorario()
				+ " como " + caixa.getNome());
	}

}