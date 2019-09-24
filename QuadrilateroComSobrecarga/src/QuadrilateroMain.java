
public class QuadrilateroMain {

	public static void main(String[] args) {
		
		//cria uma variável para guardar a referencia do objeto
		Quadrilatero quadrilatero;

		//cria um objeto e guarda sua referência na variável quadrilátero
		quadrilatero = new Quadrilatero();
		
		//utliza o objeto para fazer cálculos
		double areaQuadrado = quadrilatero.calcularArea(10);
		double areaRetangulo = quadrilatero.calcularArea(20, 10);
		double areaTrapezio = quadrilatero.calcularArea(20, 10, 5);
		double areaLosangulo = quadrilatero.calcularArea(20, 10);
		
		
		//imprime o resultado dos cálculos
		System.out.println("Área do Quadrado: "+areaQuadrado);
		System.out.println("Área do Retângulo: "+areaRetangulo);
		System.out.println("Área do Trapézio: "+areaTrapezio);
		System.out.println("Área do Losângulo: "+areaLosangulo);
		
	}

}
