

public class Paciente extends Pessoa {

	//atributos
	String dataInternacao;

	//defini��o dos m�todos set
	public void setDataInternacao(String dataInternacao) {
		
		this.dataInternacao = dataInternacao;
	}

	//sobrescrita do m�todo toString
	@Override
	public String toString() {
		return "Paciente [dataInternacao=" + dataInternacao + ", nome=" + nome + ", sexo=" + sexo + "]";
	}
	
}
