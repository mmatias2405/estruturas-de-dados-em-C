
public abstract class Pessoa {

	//atributos
	String nome;
	String sexo;
	
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
		return "Pessoa [nome=" + nome + ", sexo=" + sexo + "]";
	}
}
