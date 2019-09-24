
public abstract class Pessoa {

	//atributos
	String nome;
	String sexo;
	
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
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + "]";
	}
}
