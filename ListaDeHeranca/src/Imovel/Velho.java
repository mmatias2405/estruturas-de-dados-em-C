package Imovel;

public class Velho extends Imovel{
	private double desconto;

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public String toString() {
		String ret = "Imovel Velho: ";
		ret += this.getEndereco()+"\n";
		ret += "Valor: R$"+ this.getPreco()+" - R$"+this.getDesconto()+" = R$"+(this.getPreco()-this.getDesconto());
		return ret;
	}
}
