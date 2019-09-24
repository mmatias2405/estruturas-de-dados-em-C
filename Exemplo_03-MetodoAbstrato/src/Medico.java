
public abstract class Medico extends Funcionario {

	//atributos
	int CRM;
	
	//definição dos métodos set
	public void setCRM(int CRM) {
		this.CRM = CRM;
	}
	
	// método abstrato
	abstract void operar(); //não deve possuir implementação aqui!!!*/

	//sobrescrita do método toString
	@Override
	public String toString() {
		return "Medico [CRM=" + CRM + ", dataAdmissao=" + dataAdmissao + ", matricula=" + matricula + ", nome=" + nome
				+ ", sexo=" + sexo + "]";
	}

	
	
	

}
