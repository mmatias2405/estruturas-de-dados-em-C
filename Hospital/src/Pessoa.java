

public class Pessoa {
	//atributos
	private String nome;
	private String sexo;
	private int id;
	
	//métodos
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "nome=" + nome + ", sexo=" + sexo + ", id=" + id;
	}
	
	
}
