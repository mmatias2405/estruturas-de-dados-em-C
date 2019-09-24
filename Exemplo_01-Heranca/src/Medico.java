
public class Medico extends Funcionario {

	//atributos
	int CRM;
	
	//definição dos métodos set
	public void setCRM(int CRM) {
		this.CRM = CRM;
	}
	
	//outros métodos
	void operar() {
		// implementação desejada
		System.out.println("Medico operar()");
	}

	//sobrescrita do método toString
	@Override
	public String toString() {
		return "Medico [CRM=" + CRM + ", dataAdmissao=" + dataAdmissao + ", matricula=" + matricula + ", nome=" + nome
				+ ", sexo=" + sexo + "]";
	}

	
	
	

}
