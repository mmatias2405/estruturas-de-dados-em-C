
public class Ponto2D {

	//atributos
	private int x;
	private int y;
	
	//construtor
	public Ponto2D(int x, int y) {
		this.x = x;
		this.y = y;
	}


	//sobreposi��o do m�todo equals
	//usa os valores dos campos x e y para verificar a igualdade
	/*@Override
	public boolean equals(Object obj) {
		
		//testa que o objeto que estou comparado foi instanciado
		//a partir da classe Ponto2D (ou de uma de suas classes filhas)
		if (obj instanceof Ponto2D) {

			//faz o cast para uma refer�ncia do tipo Ponto2D
			Ponto2D outroPonto = (Ponto2D)obj;
			
			//verifico se o objeto comparado tem as mesma coordenadas x e y
			if ((this.x == outroPonto.x) && (this.y == outroPonto.y)) {
				return true;
			}
		}
			
		return false;
	}*/
	
	
	//sobreposi��o do m�todo equals (gerado pelo eclipse)
	//usa os valores dos campos x e y para verificar a igualdade
	//c�digo gerado pelo eclipse !!!
	/*@Override
	public boolean equals(Object obj) {
		
		//testa se as refer�ncias est�o associadas ao mesmo
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
		
		//faz o cast para uma refer�ncia do tipo Ponto2D
		Ponto2D other = (Ponto2D) obj;
		//verifico se o objeto comparado tem a mesma coordenada x
		if (x != other.x) {
			return false;
		}
		
		//verifica se o objeto comparado tem a mesma coordenada y
		if (y != other.y) {
			return false;
		}
		return true;
	}*/
	
}
