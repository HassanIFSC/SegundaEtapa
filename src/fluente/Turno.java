package fluente;

public class Turno {
	private String horario;

	public Turno seuTurno(String turno) {
		this.horario = turno;
		return this;
	}

	public String getHorario() {
		return horario;
	}

}