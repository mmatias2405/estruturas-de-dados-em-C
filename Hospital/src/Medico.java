

public class Medico extends Funcionario{
	//atributos
	private int CRM;
	
	
	
	//métodos gets e sets
	public int getCRM() {
		return CRM;
	}
	public void setCRM(int cRM) {
		CRM = cRM;
	}
	@Override
	public String toString() {
		return super.toString() + ", CRM=" + CRM;
	}
	

}
