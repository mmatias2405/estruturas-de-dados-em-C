
public class Gerente extends Funcionario {

	//atributos
	int CRA;
	
	//defini��o dos m�todos set
	public void setCRA(int CRA) {
		this.CRA = CRA;
	}
	
	//outros m�todos
	void liberarPagamento() {
		// implementa��o desejada
		System.out.println(nome+": Gerente liberarPagamento()");
	}

	//sobrescrita do m�todo toString
	@Override
	public String toString() {
		return "Gerente [CRA=" + CRA + ", dataAdmissao=" + dataAdmissao + ", matricula=" + matricula + ", nome=" + nome
				+ ", sexo=" + sexo + "]";
	}
	

}
