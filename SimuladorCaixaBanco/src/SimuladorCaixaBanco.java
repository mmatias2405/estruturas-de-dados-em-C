
public class SimuladorCaixaBanco {

	private static int numeroCliente; // o número do cliente a ser atendido
	private int numeroCaixa; // o número do caixa

	/**
	 * O construtor da classe inicializa o número do caixa (para identificação),
	 * inicializa o contador de clientes e imprime uma mensagem.
	*/
	SimuladorCaixaBanco(int numeroCaixa)
	{
		this.numeroCaixa = numeroCaixa;
		numeroCliente = 0;
		System.out.println("Caixa "+numeroCaixa+" iniciou operação.");

	} // fim do construtor

	/**
	 * O método iniciarAtendimento simula o atendimento de um cliente.
	 */
	public void iniciarAtendimento()
	{
		numeroCliente = numeroCliente + 1; // o próximo cliente será chamado
		System.out.print("Cliente com a senha número "+numeroCliente+", favor ");
		System.out.println("dirigir-se ao caixa número "+numeroCaixa+".");
	}


}
