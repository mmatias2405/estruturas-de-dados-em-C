
public class ConstrutoresMain {

	public static void main(String[] args) {
		
		//cria uma vari�vel para guardar a referencia do objeto do tipo Funcion�rio
		Funcionario funcionario;
		
		//cria um objeto do tipo funcionario utilizando o construtor default/padr�o
		funcionario = new Funcionario();
		
		//cria um objeto do tipo funcionario utilizando o construtor com um parametro (minimo)
		//funcionario = new Funcionario("Jos� Figueredo de Andrade Neves");
		
		//cria um objeto do tipo funcionario utilizando o construtor completo
		//funcionario = new Funcionario("Jos� Figueredo de Andrade Neves", 4000, 20, 100);
		
		//faz uso do objeto funcionario
		funcionario.GerarRelatorio();
	}

}
