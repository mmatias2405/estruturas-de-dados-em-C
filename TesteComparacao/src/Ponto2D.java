
public class Ponto2D {

	//atributos
	private int x;
	private int y;
	
	//construtor
	public Ponto2D(int x, int y) {
		this.x = x;
		this.y = y;
	}


	//sobreposição do método equals
	//usa os valores dos campos x e y para verificar a igualdade
	/*@Override
	public boolean equals(Object obj) {
		
		//testa que o objeto que estou comparado foi instanciado
		//a partir da classe Ponto2D (ou de uma de suas classes filhas)
		if (obj instanceof Ponto2D) {

			//faz o cast para uma referência do tipo Ponto2D
			Ponto2D outroPonto = (Ponto2D)obj;
			
			//verifico se o objeto comparado tem as mesma coordenadas x e y
			if ((this.x == outroPonto.x) && (this.y == outroPonto.y)) {
				return true;
			}
		}
			
		return false;
	}*/
	
	
	//sobreposição do método equals (gerado pelo eclipse)
	//usa os valores dos campos x e y para verificar a igualdade
	//código gerado pelo eclipse !!!
	/*@Override
	public boolean equals(Object obj) {
		
		//testa se as referências estão associadas ao mesmo
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
		
		//faz o cast para uma referência do tipo Ponto2D
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
