
public class Quadrilatero {

	// área do quadrado
	double calcularAreaQuadrado(double lado) {
		return lado * lado;
	}
	
	// área do retângulo
	double calcularAreaRetangulo(double baseMaior, double baseMenor) {
		return baseMaior * baseMenor;
	}
	
	// área do trapézio
	double calcularAreaTrapezio(double baseMaior, double baseMenor, double altura) {
		return ((baseMaior + baseMenor) * altura)/2;
	}
	
	// área do losango
	double calcularAreaLosangulo(float diagonalMaior, float diagonalMenor) {
		return diagonalMaior * diagonalMenor;
	}
}


