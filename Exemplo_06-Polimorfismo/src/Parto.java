
public class Parto {

	//vetor de referencias para Medicos;
	Medico[] medicos;
	
	//construtor
	public Parto() {
		
		medicos = new Medico[] {
					
			new Anestesista("Henrique", "Masculino", "28/03/2017", "CP-0155", 54782),
			new Obstetra("Paula", "Feminino", "28/03/2000", "CP-1255", 59852),
			new Pediatra("Maria", "Feminino", "28/03/1990", "CP-0245", 57845)
		};
		
	}
	
	//metodos:
	public void realizarParto() {
		
		for (int i = 0; i < medicos.length; i++) {
			
			Medico medico = medicos[i];
			medico.operar();
		}
	}
	
}
