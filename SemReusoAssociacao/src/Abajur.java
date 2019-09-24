
public class Abajur {

	private String estadoLampada = "apagado";	//indica se esta ligada ou não

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
			
			System.out.println("Lâmpada Acessa!!!");
			
		} else {
			
			System.out.println("Lâmpada Apagada!!!");
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
