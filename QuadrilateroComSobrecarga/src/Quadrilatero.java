
public class Quadrilatero {

	// �rea do quadrado
	double calcularArea(double lado) {
		return lado * lado;
	}
	
	// �rea do ret�ngulo
	double calcularArea(double baseMaior, double baseMenor) {
		return baseMaior * baseMenor;
	}
	
	// �rea do trap�zio
	double calcularArea(double baseMaior, double baseMenor, double altura) {
		return ((baseMaior + baseMenor) * altura)/2;
	}
	
	// �rea do losango
	double calcularArea(float diagonalMaior, float diagonalMenor) {
		return diagonalMaior * diagonalMenor;
	}
}


