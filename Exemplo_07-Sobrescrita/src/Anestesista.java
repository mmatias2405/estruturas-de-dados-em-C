
public class Anestesista extends Medico {

	//construtor
	public Anestesista(String nome, String sexo,
			      	   String dataAdmissao, String matricula,
			           int CRM) {
		
		super(nome,sexo,dataAdmissao,matricula,CRM); //chama o construtor da superclasse (Medico)

	}
	
	//implementa o m�todo abstrato da superclasse (Medico)
	void operar() {
		
		System.out.println(nome+" - Anestesista: operar()");
		System.out.println("\tcalcular quantidade de anest�sico;");
		System.out.println("\testerilizar local de aplica��o;");
		System.out.println("\taplicar inje��es;");
		System.out.println("\tmonitorar sensibilidade;");
	}
	
}
