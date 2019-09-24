

public class Paciente extends Pessoa {

	//atributos
	String dataInternacao;

	//definição dos métodos set
	public void setDataInternacao(String dataInternacao) {
		
		this.dataInternacao = dataInternacao;
	}

	//sobrescrita do método toString
	@Override
	public String toString() {
		return "Paciente [dataInternacao=" + dataInternacao + ", nome=" + nome + ", sexo=" + sexo + "]";
	}
	
}
