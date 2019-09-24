package Imovel;

public class Novo extends Imovel{
	private double valorAdicional;

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	public String toString() {
		String ret = "Imovel Novo: ";
		ret += this.getEndereco()+"\n";
		ret += "Valor: R$"+ this.getPreco()+" + R$"+this.getValorAdicional()+" = R$"+(this.getPreco()+this.getValorAdicional());
		return ret;
	}
}
