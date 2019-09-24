
public class Funcionario {

	String 	nome;
	double 	salarioBase;
	int 	quantidadeHorasExtra;
	double	valorHorasExtra;

	//Construtor padrão
	/*public Funcionario() {
		System.out.print("Executando o método construtor padrão");
	}

	//construtor mínimo
	//Construtor com um parâmetro (construtor mínimo)
	public Funcionario(String nome) {

		this.nome = nome;
		System.out.println("Executando o método construtor mínimo");
	}

	//Construtor com vários parâmetros (construtor completo)
	public Funcionario(String nome, double salarioBase, int quantidadeHorasExtra, double valorHorasExtra){

		this.nome = nome;
		this.salarioBase = salarioBase;
		this.quantidadeHorasExtra = quantidadeHorasExtra;
		this.valorHorasExtra = valorHorasExtra;

		System.out.println("Executando o método construtor máximo");
	}
*/

	//método: exibe os dados do funcionario
	public void GerarRelatorio() {

		System.out.println("\n\nNome: "+nome);
		System.out.println("Salario: "+salarioBase);
		System.out.println("Total de Horas-Extras: "+quantidadeHorasExtra);
		System.out.println("Valor Unitario da Hora-Extra: "+valorHorasExtra);
	}


}
