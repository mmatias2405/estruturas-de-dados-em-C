
public abstract class Medico extends Funcionario {

	//atributos
	int CRM;
	
	//construtor
	public Medico(String nome, String sexo,
			      String dataAdmissao, String matricula,
			      int CRM) {
		
		super(nome,sexo,dataAdmissao,matricula); //chama o construtor da superclasse (Funcionario)
		
		this.CRM = CRM;
	}
	
	//defini��o dos m�todos set
	public void setCRM(int CRM) {
		this.CRM = CRM;
	}
	
	// m�todo abstrato
	abstract void operar(); //n�o deve possuir implementa��o aqui!!!*/

	//sobrescrita do m�todo toString
	@Override
	public String toString() {
		
		return (
			super.toString() // chama o metodo "toString" da superclasse (Funcionario)
			+", CRM=" + CRM
		);
	}

	
	
	

}
