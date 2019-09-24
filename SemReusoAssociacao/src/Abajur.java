
public class Abajur {

	private String estadoLampada = "apagado";	//indica se esta ligada ou n�o

	//acende a lampada
	private void acende() {
		estadoLampada = "aceso";
	}

	//apaga a lampada
	private void apaga() {
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
	
	//liga o abajur
	public void liga() {
		
		//acende a lampada
		acende();
	}
	
	//desliga o abajur
	public void desliga() {
		
		//apaga a lampada
		apaga();
	}
}
