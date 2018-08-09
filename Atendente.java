
public class Atendente {
	
	private String nome;
	private double salario;
	
Agenda agenda = new Agenda();

	
	public Atendente(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public void marcaConsulta(Paciente paciente, Medico medico, String dataConsulta, String dataRetorno) {
		Consulta c = new Consulta(paciente, medico, dataConsulta, dataRetorno);
		agenda.adicionaConsulta(c);
	}
	
	public void marcaExame(Paciente paciente, String dataExame, double valor, String dataRetorno) {
		Exame e = new Exame(paciente, dataExame, valor, dataRetorno);
		agenda.adicionaExame(e);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

}
