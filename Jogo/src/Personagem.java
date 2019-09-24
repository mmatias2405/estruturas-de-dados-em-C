
public class Personagem {

	//Defini��o dos atributos da classe
	String nome;
	String cor;
	int quantidadeDeCogumelos;
	float altura;
	String tipoFisico;
	boolean possuiBigode;
	
	//----------------------------------------------------------------
	//m�todos get/set ------------------------------------------------
	//----------------------------------------------------------------
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getQuantidadeDeCogumelos() {
		return quantidadeDeCogumelos;
	}
	
	public void setQuantidadeDeCogumelos(int quantidadeDeCogumelos) {
		this.quantidadeDeCogumelos = quantidadeDeCogumelos;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public String getTipoFisico() {
		return tipoFisico;
	}
	
	public void setTipoFisico(String tipoFisico) {
		this.tipoFisico = tipoFisico;
	}
	
	public boolean getPossuiBigode() {
		return possuiBigode;
	}
	
	public void setPossuiBigode(boolean possuiBigode) {
		this.possuiBigode = possuiBigode;
	}
	
	//----------------------------------------------------------------
	//metodos igualdade - identidade - representa��o padr�o ----------
	//----------------------------------------------------------------

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Personagem)) {
			return false;
		}
		Personagem other = (Personagem) obj;
		if (nome == null) {
			if (other.nome != null) {
				return false;
			}
		} else if (!nome.equals(other.nome)) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		
		return "Nome do personagem: " + this.nome;
	}
	
	//----------------------------------------------------------------
	//demais m�todos da classe ---------------------------------------
	//----------------------------------------------------------------
	
	void pular() {
		// implementa��o aqui ...
		
		System.out.println(nome+" est� pulando!");
	}
	
	public void pegarCogumelo(Cogumelo cogumelo) {
		// implementa��o aqui ...
		
		System.out.println(nome+" est� pegando um cogumelo!");
	}
	

	public BolaFogo atirarFogo() {
		
		// implementa��o aqui...
		
		System.out.println(nome+" est� atirando uma bola de fogo!");
		
		return new BolaFogo();
		
	}
	
	
	
}
