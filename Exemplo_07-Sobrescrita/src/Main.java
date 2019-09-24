
public class Main {

	public static void main(String[] args) {
		
		Medico anestesista = new Anestesista(
			"Henrique", "Masculino",
			"28/03/1982", "CP-0155",
			54782
		);
		
		Medico residente = new ResidenteAnestesista(
				"Pedro", "Masculino",
				"28/03/2015", "CP-0055",
				78514
		);
		
		
		System.out.println("anestesista: ["+anestesista+"]");
		anestesista.operar();
		
		System.out.println();
		
		System.out.println("residente: ["+residente+"]");
		residente.operar();

	}

}
