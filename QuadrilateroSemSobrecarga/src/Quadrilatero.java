
public class Quadrilatero {

	// �rea do quadrado
	double calcularAreaQuadrado(double lado) {
		return lado * lado;
	}
	
	// �rea do ret�ngulo
	double calcularAreaRetangulo(double baseMaior, double baseMenor) {
		return baseMaior * baseMenor;
	}
	
	// �rea do trap�zio
	double calcularAreaTrapezio(double baseMaior, double baseMenor, double altura) {
		return ((baseMaior + baseMenor) * altura)/2;
	}
	
	// �rea do losango
	double calcularAreaLosangulo(float diagonalMaior, float diagonalMenor) {
		return diagonalMaior * diagonalMenor;
	}
}


