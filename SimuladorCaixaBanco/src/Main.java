
public class Main {

	public static void main(String[] args) {
		
		SimuladorCaixaBanco caixa01 = new SimuladorCaixaBanco(1);
		SimuladorCaixaBanco caixa02 = new SimuladorCaixaBanco(2);
		SimuladorCaixaBanco caixa03 = new SimuladorCaixaBanco(3);
		SimuladorCaixaBanco caixa04 = new SimuladorCaixaBanco(4);
		
		//simulação de atendimento com balanceamento desigual
		caixa01.iniciarAtendimento();
		caixa02.iniciarAtendimento();
		caixa03.iniciarAtendimento();
		caixa01.iniciarAtendimento();
		caixa03.iniciarAtendimento();
		caixa04.iniciarAtendimento();
		caixa02.iniciarAtendimento();
		caixa02.iniciarAtendimento();
		caixa01.iniciarAtendimento();
		caixa03.iniciarAtendimento();
		caixa04.iniciarAtendimento();
		caixa04.iniciarAtendimento();

	}

}
