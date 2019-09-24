

public class Paciente extends Pessoa {

	//atributos
	String dataInternacao;
	
	//construtor
	public Paciente(String nome, String sexo, String dataInternacao) {
		
		super(nome,sexo); //chama o construtor da superclasse (Pessoa)
		
		this.dataInternacao = dataInternacao;
	}

	//definição dos métodos set
	public void setDataInternacao(String dataInternacao) {
		
		this.dataInternacao = dataInternacao;
	}

	//sobrescrita do método toString
	@Override
	public String toString() {
		
		return (
			super.toString() // chama o metodo "toString" da superclasse (Pessoa)
			+ ", dataInternacao=" + dataInternacao
		);
	}
	
}
