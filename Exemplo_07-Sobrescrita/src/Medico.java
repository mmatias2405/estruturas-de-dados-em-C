
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
	
	//definição dos métodos set
	public void setCRM(int CRM) {
		this.CRM = CRM;
	}
	
	// método abstrato
	abstract void operar(); //não deve possuir implementação aqui!!!*/

	//sobrescrita do método toString
	@Override
	public String toString() {
		
		return (
			super.toString() // chama o metodo "toString" da superclasse (Funcionario)
			+", CRM=" + CRM
		);
	}

	
	
	

}
