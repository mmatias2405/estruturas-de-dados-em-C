
//representa uma lâmpada em uso
public class Lampada {

	private String estadoLampada = "apagado";	//indica se esta ligada ou não


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
			
			System.out.println("Lâmpada Acessa!!!");
			
		} else {
			
			System.out.println("Lâmpada Apagada!!!");
		}

	}
}
