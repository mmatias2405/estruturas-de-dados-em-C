

public class Funcionario extends Pessoa {

	//atributos
	String dataAdmissao;
	String matricula;

	
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
		return "Funcionario [dataAdmissao=" + dataAdmissao + ", matricula=" + matricula + ", nome=" + nome + ", sexo="
				+ sexo + "]";
	}
	

	
}
