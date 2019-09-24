
public class Ponto2D {

	//atributos
	private int x;
	private int y;
	
	//construtor
	public Ponto2D(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//métodos get	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	//métodos set
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	//sobreposição do método toString() gerado pelo Eclipse
	@Override
	public String toString() {
		return "Ponto2D[x=" + x + ", y=" + y + "]";
	}

	//sobreposição do método toString()
	/*@Override
	public String toString() {
		return "(" + getX() + ", " + getY() + ")";
	}*/
	
	

	//sobreposição do método equals (gerado pelo Eclipse)
	//usa os valores dos campos x e y para verificar a igualdade
	/*@Override
	public boolean equals(Object obj) {
		
		//testa se as referencias estão associadas ao mesmo
		//objeto na memória
		if (this == obj) {
			return true;
		}
		//testa se o objeto que estou comparando não é nulo
		if (obj == null) {
			return false;
		}
		//testa que o objeto que estou comparado foi instanciado
		//a partir da classe Ponto2D (ou de uma de suas classes filhas)
		if (!(obj instanceof Ponto2D)) {
			return false;
		}
		//faço o cast para uma referencia do tipo Ponto2D
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
	
	//sobreposição do método hashCode (gerado pelo eclipse)
	//usa os valores dos campos x e y para gerar o hashcode
	/*@Override
	public int hashCode() {
		
		//uma implementação do hashcode
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}*/

}
