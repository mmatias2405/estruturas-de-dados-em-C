
public class QuadrilateroMain {

	public static void main(String[] args) {
		
		//cria uma vari�vel para guardar a referencia do objeto
		Quadrilatero quadrilatero;

		//cria um objeto e guarda sua refer�ncia na vari�vel quadril�tero
		quadrilatero = new Quadrilatero();
		
		//utliza o objeto para fazer c�lculos
		double areaQuadrado = quadrilatero.calcularArea(10);
		double areaRetangulo = quadrilatero.calcularArea(20, 10);
		double areaTrapezio = quadrilatero.calcularArea(20, 10, 5);
		double areaLosangulo = quadrilatero.calcularArea(20, 10);
		
		
		//imprime o resultado dos c�lculos
		System.out.println("�rea do Quadrado: "+areaQuadrado);
		System.out.println("�rea do Ret�ngulo: "+areaRetangulo);
		System.out.println("�rea do Trap�zio: "+areaTrapezio);
		System.out.println("�rea do Los�ngulo: "+areaLosangulo);
		
	}

}
