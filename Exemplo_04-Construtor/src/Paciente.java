

public class Paciente extends Pessoa {

	//atributos
	String dataInternacao;
	
	
	//construtor padrão --> por que esse construtor gera um ERRO?
	/*public Paciente() {
		
		
	}*/
	
	//construtor
	public Paciente(String nome, String sexo, String dataInternacao) {
		
		//Porque comentar essa linha gera um erro?
		super(nome,sexo); //chama o construtor da superclasse (Pessoa)
		
		System.out.println("Construtor Paciente !!!");
		this.dataInternacao = dataInternacao;
	}

	//definição dos métodos set
	public void setDataInternacao(String dataInternacao) {
		
		this.dataInternacao = dataInternacao;
	}

	//sobrescrita do método toString
	@Override
	public String toString() {
		return "[nome=" + nome + ", sexo=" + sexo + 
			   ", dataInternacao=" + dataInternacao + "]";
	}
	
}
