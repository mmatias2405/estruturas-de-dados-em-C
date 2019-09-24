package Ingresso;

public class VIP extends Ingresso{
	private double valorAdicional;
	
	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	public void imprimeValor() {
		System.out.print("R$"+(super.getValor()+this.valorAdicional));
	}

}
