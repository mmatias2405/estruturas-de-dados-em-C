
public class Funcionario {

	String 	nome;
	double 	salarioBase;
	int 	quantidadeHorasExtra;
	double	valorHorasExtra;

	//Construtor padr�o
	/*public Funcionario() {
		System.out.print("Executando o m�todo construtor padr�o");
	}

	//construtor m�nimo
	//Construtor com um par�metro (construtor m�nimo)
	public Funcionario(String nome) {

		this.nome = nome;
		System.out.println("Executando o m�todo construtor m�nimo");
	}

	//Construtor com v�rios par�metros (construtor completo)
	public Funcionario(String nome, double salarioBase, int quantidadeHorasExtra, double valorHorasExtra){

		this.nome = nome;
		this.salarioBase = salarioBase;
		this.quantidadeHorasExtra = quantidadeHorasExtra;
		this.valorHorasExtra = valorHorasExtra;

		System.out.println("Executando o m�todo construtor m�ximo");
	}
*/

	//m�todo: exibe os dados do funcionario
	public void GerarRelatorio() {

		System.out.println("\n\nNome: "+nome);
		System.out.println("Salario: "+salarioBase);
		System.out.println("Total de Horas-Extras: "+quantidadeHorasExtra);
		System.out.println("Valor Unitario da Hora-Extra: "+valorHorasExtra);
	}


}
