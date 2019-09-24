
public class Main {

	public static void main(String[] args) {
		
		/*Pessoa pessoa = new Pessoa();
		pessoa.setNome("Antonio");
		pessoa.setSexo("Masculino");*/
		
		Paciente paciente = new Paciente();
		paciente.setNome("Pedro");
		paciente.setSexo("Masculino");
		paciente.setDataInternacao("21/05/2018");
		
		/*Funcionario funcionario = new Funcionario();
		funcionario.setNome("Ana");
		funcionario.setSexo("Feminino");
		funcionario.setDataAdmissao("25/03/2005");
		funcionario.setMatricula("CP-0145");*/
		
		/*Medico medico = new Medico();
		medico.setNome("Paula");
		medico.setSexo("Feminino");
		medico.setDataAdmissao("18/09/2016");
		medico.setMatricula("CP-0105");
		medico.setCRM(54832);*/
		
		Gerente gerente = new Gerente();
		gerente.setNome("André");
		gerente.setSexo("Masculino");
		gerente.setDataAdmissao("03/01/2018");
		gerente.setMatricula("CP-0485");
		gerente.setCRA(45782);
		
		
		Anestesista anestesista = new Anestesista();
		anestesista.setNome("Henrique");
		anestesista.setSexo("Masculino");
		anestesista.setDataAdmissao("28/03/2017");
		anestesista.setMatricula("CP-0155");
		anestesista.setCRM(54782);
		
		System.out.println("paciente: "+paciente);
		
		System.out.println("gerente: "+gerente);
		gerente.liberarPagamento();
		
		System.out.println("anestesista: "+anestesista);
		anestesista.operar();

	}

}
