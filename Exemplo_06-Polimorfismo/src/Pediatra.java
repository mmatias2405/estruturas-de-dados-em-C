
public class Pediatra extends Medico {

	//construtor
	public Pediatra(String nome, String sexo,
			      	   String dataAdmissao, String matricula,
			           int CRM) {
		
		super(nome,sexo,dataAdmissao,matricula,CRM); //chama o construtor da superclasse (Medico)
		
	}
	
	//implementa o método abstrato da superclasse (Medico)
	void operar() {
		
		System.out.println(nome+": Pediatra operar()");
	}
	
}
