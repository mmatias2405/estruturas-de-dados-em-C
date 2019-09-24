
public class Imovel {
	private int matricula;
	private String endereco;
	private float metragem;
	private boolean venda;
	
	public Imovel(String endereco, float metragem, boolean venda) {
		this.matricula = 0;
		this.endereco = endereco;
		this.metragem = metragem;
		this.venda = venda;
	}
	
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getEndereco() {
		return this.endereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + matricula;
		result = prime * result + Float.floatToIntBits(metragem);
		result = prime * result + (venda ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Imovel other = (Imovel) obj;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (matricula != other.matricula)
			return false;
		if (Float.floatToIntBits(metragem) != Float.floatToIntBits(other.metragem))
			return false;
		if (venda != other.venda)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		if(venda)
			return "["+matricula+": "+endereco+" "+ metragem + "M² a venda]";
		
		return "["+matricula+": "+endereco+" "+metragem + "M² para locação]";
	}
	

}
