

public class Paciente extends Pessoa {

	//atributos
	String dataInternacao;
	
	
	//construtor padr�o --> por que esse construtor gera um ERRO?
	/*public Paciente() {
		
		
	}*/
	
	//construtor
	public Paciente(String nome, String sexo, String dataInternacao) {
		
		//Porque comentar essa linha gera um erro?
		super(nome,sexo); //chama o construtor da superclasse (Pessoa)
		
		System.out.println("Construtor Paciente !!!");
		this.dataInternacao = dataInternacao;
	}

	//defini��o dos m�todos set
	public void setDataInternacao(String dataInternacao) {
		
		this.dataInternacao = dataInternacao;
	}

	//sobrescrita do m�todo toString
	@Override
	public String toString() {
		return "[nome=" + nome + ", sexo=" + sexo + 
			   ", dataInternacao=" + dataInternacao + "]";
	}
	
}
