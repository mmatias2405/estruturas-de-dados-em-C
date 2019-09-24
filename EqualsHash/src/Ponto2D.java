
public class Ponto2D {

	//atributos
	private int x;
	private int y;
	
	//construtor
	public Ponto2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//m�todos get	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	//m�todos set
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	//sobreposi��o do m�todo toString() gerado pelo Eclipse
	@Override
	public String toString() {
		return "Ponto2D[x=" + x + ", y=" + y + "]";
	}

	//sobreposi��o do m�todo toString()
	/*@Override
	public String toString() {
		return "(" + getX() + ", " + getY() + ")";
	}*/
	
	

	//sobreposi��o do m�todo equals (gerado pelo Eclipse)
	//usa os valores dos campos x e y para verificar a igualdade
	/*@Override
	public boolean equals(Object obj) {
		
		//testa se as referencias est�o associadas ao mesmo
		//objeto na mem�ria
		if (this == obj) {
			return true;
		}
		//testa se o objeto que estou comparando n�o � nulo
		if (obj == null) {
			return false;
		}
		//testa que o objeto que estou comparado foi instanciado
		//a partir da classe Ponto2D (ou de uma de suas classes filhas)
		if (!(obj instanceof Ponto2D)) {
			return false;
		}
		//fa�o o cast para uma referencia do tipo Ponto2D
		Ponto2D other = (Ponto2D) obj;
		//verifico se o objeto comparado tem a mesma coordenada x
		if (x != other.x) {
			return false;
		}
		//verifico se o objeto comparado tem a mesma coordenada y
		if (y != other.y) {
			return false;
		}
		return true;
	}*/
	
	//sobreposi��o do m�todo hashCode (gerado pelo eclipse)
	//usa os valores dos campos x e y para gerar o hashcode
	/*@Override
	public int hashCode() {
		
		//uma implementa��o do hashcode
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}*/

}
