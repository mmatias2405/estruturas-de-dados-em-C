
public class Gerente extends Funcionario {

	//atributos
	int CRA;
	
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
		return "Gerente [CRA=" + CRA + ", dataAdmissao=" + dataAdmissao + ", matricula=" + matricula + ", nome=" + nome
				+ ", sexo=" + sexo + "]";
	}
	

}
