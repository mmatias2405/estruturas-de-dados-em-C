
public class Main {

	public static void main(String[] args) {

		Ponto2D x = new Ponto2D(1, 2);
		Ponto2D y = new Ponto2D(1, 2);
		Ponto2D z = new Ponto2D(1, 2);

		int totalCasosCorretos = 0;

		//Teste de reflexividade
		if (x.equals(x)==true) {

			System.out.println("Passou: É reflexivo!");
			totalCasosCorretos++;

		} else {

			System.out.println("Reprovado: Não é reflexivo");
		}

		//teste de simetria
		if ((x.equals(y)==true) && (y.equals(x)==true)) {

			System.out.println("Passou: É simetrico!");
			totalCasosCorretos++;

		} else {

			System.out.println("Reprovado: Não é simetrico");
		}


		//teste de transitividade
		if ((((x.equals(y)==true) && (y.equals(z)==true))  &&  (x.equals(z)==true)) ) {

			System.out.println("Passou: É transitivo!");

			totalCasosCorretos++;

		} else {

			System.out.println("Reprovado: Não é transitivo");
		}

		//teste nenhum objeto podes ser igual a null
		if (x.equals(null) == false) {

			System.out.println("Passou: Nenhum objeto pode ser igual a null");

			totalCasosCorretos++;

		} else {

			System.out.println("Reprovado: Um objeto pode ser igual a null?!");
		}

		System.out.println("\nResultado: "+totalCasosCorretos+"/4 casos corretos");

	}

}
