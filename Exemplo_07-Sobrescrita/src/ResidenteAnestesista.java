
public class ResidenteAnestesista extends Anestesista {

	//construtor
	public ResidenteAnestesista(String nome, String sexo,
	      	   String dataAdmissao, String matricula,
	           int CRM) {

		super(nome,sexo,dataAdmissao,matricula,CRM); //chama o construtor da superclasse (Medico)

	}
	
	//sobrescreve o método abstrato da superclasse (Anestesista)
	@Override
	void operar() {
		
		System.out.println(nome+" - Residente Anestesista: operar()");
		System.out.println("\tcalcular quantidade de anestésico;");
		System.out.println("\testerilizar local de aplicação;");
	}
}
