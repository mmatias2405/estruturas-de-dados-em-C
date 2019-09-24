
public class Main {

	public static void main(String[] args) {

		//cria um objeto lampada que ser� encaixada em um abajur
		Lampada lampada;			//cria a vari�vel para guardar a referencia do objeto
		lampada = new Lampada();	//cria um objeto e guarda sua refer�ncia na vari�vel lampada
		
		//cria o objeto abajur
		Abajur abajur;			//cria a vari�vel para guardar a referencia do objeto
		abajur = new Abajur();  //cria um objeto e guarda sua refer�ncia na vari�vel abajur
		
		//faz uso do objeto abajur
		//abajur.encaixaLampada(lampada); //insere uma lampada no abajur
		abajur.liga();					//liga o abajur
		abajur.mostraEstado();			//mostra qual o estado corrente do abajur
	}

}
