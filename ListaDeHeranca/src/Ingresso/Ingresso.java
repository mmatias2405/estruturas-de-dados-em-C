package Ingresso;

public class Ingresso {
	private double valor;
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValor() {
		return valor;
	}
	public void imprimeValor() {
		System.out.print("R$"+valor);
	}

}
