
public class Medico extends Funcionario {

	//atributos
	int CRM;
	
	//defini��o dos m�todos set
	public void setCRM(int CRM) {
		this.CRM = CRM;
	}
	
	//outros m�todos
	void operar() {
		// implementa��o desejada
		System.out.println("Medico operar()");
	}

	//sobrescrita do m�todo toString
	@Override
	public String toString() {
		return "Medico [CRM=" + CRM + ", dataAdmissao=" + dataAdmissao + ", matricula=" + matricula + ", nome=" + nome
				+ ", sexo=" + sexo + "]";
	}

	
	
	

}
