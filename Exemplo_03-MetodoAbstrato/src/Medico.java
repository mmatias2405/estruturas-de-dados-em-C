
public abstract class Medico extends Funcionario {

	//atributos
	int CRM;
	
	//defini��o dos m�todos set
	public void setCRM(int CRM) {
		this.CRM = CRM;
	}
	
	// m�todo abstrato
	abstract void operar(); //n�o deve possuir implementa��o aqui!!!*/

	//sobrescrita do m�todo toString
	@Override
	public String toString() {
		return "Medico [CRM=" + CRM + ", dataAdmissao=" + dataAdmissao + ", matricula=" + matricula + ", nome=" + nome
				+ ", sexo=" + sexo + "]";
	}

	
	
	

}
