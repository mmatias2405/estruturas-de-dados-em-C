package Ingresso;

public class CamaroteSuperior extends VIP{
	private int localizacao;

	public int getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(int localizacao) {
		this.localizacao = localizacao;
	}

	public void imprimeLocalizacao() {
		System.out.print("Camarote Superior Numero: "+localizacao);
	}
}
