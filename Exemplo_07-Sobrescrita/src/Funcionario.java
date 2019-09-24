

public abstract class Funcionario extends Pessoa {

	//atributos
	String dataAdmissao;
	String matricula;

	//construtor
	public Funcionario(String nome, String sexo,
			           String dataAdmissao, String matricula) {
		
		super(nome,sexo); //chama o construtor da superclasse (Pessoa)
		
		this.dataAdmissao = dataAdmissao;
		this.matricula = matricula;
	}
	
	
	//defini��o dos m�todos set
	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	//sobrescrita do m�todo toString
	@Override
	public String toString() {
		
		return (
			super.toString() // chama o metodo "toString" da superclasse (Pessoa)
			+ ", dataAdmissao=" + dataAdmissao + ", matricula=" + matricula
		);
	}
	

	
}
