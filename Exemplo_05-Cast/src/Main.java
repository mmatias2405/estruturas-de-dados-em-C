
public class Main {

	public static void main(String[] args) {
		
		//-----------------------------------------------
		// Exemplo de UPCAST ----------------------------
		//-----------------------------------------------
		
		Pessoa pessoa;
		
		pessoa = new Paciente();		//UPCAST: Paciente --> Pessoa
		pessoa = new Funcionario(); 	//UPCAST: Funcionario --> Pessoa;
		pessoa = new Medico(); 			//UPCAST: Medico --> Pessoa;
		pessoa = new Gerente();			//UPCAST: Gerente --> Pessoa
		pessoa = new Anestesista();		//UPCAST: Anestesista --> Pessoa
		
		
		
		//-----------------------------------------------
		// Exemplo de DOWNCAST --------------------------
		//-----------------------------------------------
		
		Funcionario funcionario_01 = new Gerente();		//UPCAST: Gerente --> Funcionario;
		Gerente gerente_01 = (Gerente) funcionario_01;	//DOWNCAST: Funcionario --> Gerente 
														//(funciona porque funcionario referencia um objeto do Gerente);
		
		Funcionario funcionario_02 = new Funcionario();	//N�o ocorre cast 
														//(referencia e objeto s�o do mesmo tipo - Funcionario);
		
		Gerente gerente_02 = (Gerente) funcionario_02;	//DOWNCAST: Funcionario --> Gerente;
														//N�o funciona --> gera erro em tempo de execu��o;
														//Nem sempre um funcionario � um gerente
														//Funcionario pode se especializar em Gerente, Medico, Anestesista
		
		//-----------------------------------------------

	}

}
