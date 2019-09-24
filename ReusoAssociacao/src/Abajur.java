
public class Abajur {

	private Lampada lampada;

	//encaixa uma lampada no abajur
	public void encaixaLampada(Lampada lampada) {
		this.lampada = lampada;
	}
	
	//mostra o estado da lampada
	public void mostraEstado() {
		if(lampada != null) {
		lampada.mostraEstado();
		} else {
			System.out.println("Nenhuma Lampada Encaixada!!!");
		}
	}
	
	//liga o abajur
	public void liga() {
		
		if(lampada != null) {
		//acende a lampada
		lampada.acende();
		}
	}
	
	//desliga o abajur
	public void desliga() {
		
		if(lampada != null) {
			//apaga a lampada
			lampada.apaga();
		}
	}
}
