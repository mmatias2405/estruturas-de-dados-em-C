
public class Quadrilatero {

	// área do quadrado
	double calcularArea(double lado) {
		return lado * lado;
	}
	
	// área do retângulo
	double calcularArea(double baseMaior, double baseMenor) {
		return baseMaior * baseMenor;
	}
	
	// área do trapézio
	double calcularArea(double baseMaior, double baseMenor, double altura) {
		return ((baseMaior + baseMenor) * altura)/2;
	}
	
	// área do losango
	double calcularArea(float diagonalMaior, float diagonalMenor) {
		return diagonalMaior * diagonalMenor;
	}
}


