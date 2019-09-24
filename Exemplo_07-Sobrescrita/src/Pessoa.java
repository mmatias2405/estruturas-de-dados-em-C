
public abstract class Pessoa {

	//atributos
	String nome;
	String sexo;
	
	
	//construtor com parâmetros
	public Pessoa(String nome, String sexo) {
						
		this.nome = nome;
		this.sexo = sexo;
	}

	//definição dos métodos set
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	//sobrescrita do método toString
	@Override
	public String toString() {
		return ("nome=" + nome + ", sexo=" + sexo);
	}
}
