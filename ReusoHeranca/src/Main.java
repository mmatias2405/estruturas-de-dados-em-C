
public class Main {

	public static void main(String[] args) {
	
		
		EstudanteEnsinoMedio estudanteMedio;			//cria a variável para guardar a referencia do objeto
		estudanteMedio = new EstudanteEnsinoMedio();	//cria um objeto e guarda sua referência na variável estudanteMedio
		
		EstudanteEnsinoSuperior estudanteSuperior; //cria a variável para guardar a referencia do objeto
		estudanteSuperior = new EstudanteEnsinoSuperior(); //cria um objeto e guarda sua referência na variável estudanteSuperio
		
		
		//usa o objeto 
		estudanteMedio.nome = "Pedro Silva e Silva";
		estudanteMedio.nomeDoResposavel = "Paula Silva e Silva";
		estudanteMedio.matricular();
		estudanteMedio.estudar();
		
		//usa o objeto
		estudanteSuperior.nome = "Ana Maria Fonseca";
		estudanteSuperior.matricular();
		estudanteSuperior.estudar();
		estudanteSuperior.executarProjetoPesquisa();

	}

}
