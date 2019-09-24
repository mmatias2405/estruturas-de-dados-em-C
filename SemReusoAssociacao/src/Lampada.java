
//representa uma l�mpada em uso
public class Lampada {

	private String estadoLampada = "apagado";	//indica se esta ligada ou n�o


	//acende a lampada
	public void acende() {
		estadoLampada = "aceso";
	}

	//apaga a lampada
	public void apaga() {
		estadoLampada = "apagado";
	}

	//mostra o estado da lampada
	public void mostraEstado() {

		if(estadoLampada == "aceso") {
			
			System.out.println("L�mpada Acessa!!!");
			
		} else {
			
			System.out.println("L�mpada Apagada!!!");
		}

	}
}
