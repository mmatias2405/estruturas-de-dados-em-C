
public class Anestesista extends Medico {

	//construtor
	public Anestesista(String nome, String sexo,
			      	   String dataAdmissao, String matricula,
			           int CRM) {
		
		super(nome,sexo,dataAdmissao,matricula,CRM); //chama o construtor da superclasse (Medico)

	}
	
	//implementa o método abstrato da superclasse (Medico)
	void operar() {
		
		System.out.println(nome+": Anestesista operar()");
	}
	
}
