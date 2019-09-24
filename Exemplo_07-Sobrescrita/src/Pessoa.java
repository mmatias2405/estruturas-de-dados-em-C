
public abstract class Pessoa {

	//atributos
	String nome;
	String sexo;
	
	
	//construtor com par�metros
	public Pessoa(String nome, String sexo) {
						
		this.nome = nome;
		this.sexo = sexo;
	}

	//defini��o dos m�todos set
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	//sobrescrita do m�todo toString
	@Override
	public String toString() {
		return ("nome=" + nome + ", sexo=" + sexo);
	}
}
