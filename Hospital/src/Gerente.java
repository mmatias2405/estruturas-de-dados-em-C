

public class Gerente extends Funcionario{
	//atributos
	private int CRA;
	
	//métodos
	public int getCRA() {
		return CRA;
	}
	public void setCRA(int cRA) {
		CRA = cRA;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", CRA=" + CRA;
	}
	
	
}
