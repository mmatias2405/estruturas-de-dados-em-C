
public class Main {

	public static void main(String[] args) {

		//cria um objeto lampada
		Lampada lampada;			//cria a variável para guardar a referencia do objeto
		lampada = new Lampada();	//cria um objeto e guarda sua referência na variável lampada
		//usa o objeto lampada
		lampada.acende();
		lampada.mostraEstado();
		
		
		//cria o objeto abajur
		Abajur abajur;			//cria a variável para guardar a referencia do objeto
		abajur = new Abajur();	//cria um objeto e guarda sua referência na variável abajur
		//usa o objeto abajur
		abajur.liga();
		abajur.mostraEstado();
		

	}

}
