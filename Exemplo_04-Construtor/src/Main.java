
public class Main {

	public static void main(String[] args) {
		
		
		//constroi um objeto anestesista
		Anestesista anestesista = new Anestesista(
			"Henrique", "Masculino",
			"28/03/2017", "CP-0155",
			54782
		);
		
		System.out.println();
		
		//utiliza o objeto anestesista
		System.out.println("anestesista"+anestesista);
		anestesista.operar();

	}

}
