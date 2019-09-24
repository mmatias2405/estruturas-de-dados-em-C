import java.util.Date;

public class Funcionario extends Pessoa{
	//atributos
	private Date dataAdmissao;
	private String matricula;
	
	//métodos
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		return super.toString() + "dataAdmissao=" + dataAdmissao + ", matricula=" + matricula;
	}
	
	
	
	
}
