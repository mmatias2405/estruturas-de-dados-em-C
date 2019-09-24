import java.util.Date;

public class Paciente extends Pessoa{
	//atributos
	private Date dataInternacao;
	
	public Date getDataInternacao() {
		return dataInternacao;
	}
	public void setDataInternacao(Date dataInternacao) {
		this.dataInternacao = dataInternacao;
	}
	@Override
	public String toString() {
		return super.toString() + ", dataInternacao=" + dataInternacao;
	}
	
	
	
}
