
public class Main {

	public static void main(String[] args) {

		//cria um objeto lampada
		Lampada lampada;			//cria a vari�vel para guardar a referencia do objeto
		lampada = new Lampada();	//cria um objeto e guarda sua refer�ncia na vari�vel lampada
		//usa o objeto lampada
		lampada.acende();
		lampada.mostraEstado();
		
		
		//cria o objeto abajur
		Abajur abajur;			//cria a vari�vel para guardar a referencia do objeto
		abajur = new Abajur();	//cria um objeto e guarda sua refer�ncia na vari�vel abajur
		//usa o objeto abajur
		abajur.liga();
		abajur.mostraEstado();
		

	}

}
