
public class Gerente extends Funcionario {

	//atributos
	int CRA;
	
	//construtor
	public Gerente(String nome, String sexo,
			       String dataAdmissao, String matricula,
			       int CRA) {
		
		super(nome,sexo,dataAdmissao,matricula); //chama o construtor da superclasse (Funcionario)

		this.CRA = CRA;
	}
	
	//definição dos métodos set
	public void setCRA(int CRA) {
		this.CRA = CRA;
	}
	
	//outros métodos
	void liberarPagamento() {
		// implementação desejada
		System.out.println(nome+": Gerente liberarPagamento()");
	}

	//sobrescrita do método toString
	@Override
	public String toString() {
		
		return "[nome=" + nome + ", sexo=" + sexo + 
			   ", dataAdmissao=" + dataAdmissao + ", matricula=" + matricula +
			   ", CRA=" + CRA +"]";
	}
	

}
