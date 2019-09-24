
public class Main {

	public static void main(String[] args) {

		//cria um objeto lampada que será encaixada em um abajur
		Lampada lampada;			//cria a variável para guardar a referencia do objeto
		lampada = new Lampada();	//cria um objeto e guarda sua referência na variável lampada
		
		//cria o objeto abajur
		Abajur abajur;			//cria a variável para guardar a referencia do objeto
		abajur = new Abajur();  //cria um objeto e guarda sua referência na variável abajur
		
		//faz uso do objeto abajur
		//abajur.encaixaLampada(lampada); //insere uma lampada no abajur
		abajur.liga();					//liga o abajur
		abajur.mostraEstado();			//mostra qual o estado corrente do abajur
	}

}
