
public class SimuladorCaixaBanco {

	private static int numeroCliente; // o n�mero do cliente a ser atendido
	private int numeroCaixa; // o n�mero do caixa

	/**
	 * O construtor da classe inicializa o n�mero do caixa (para identifica��o),
	 * inicializa o contador de clientes e imprime uma mensagem.
	*/
	SimuladorCaixaBanco(int numeroCaixa)
	{
		this.numeroCaixa = numeroCaixa;
		numeroCliente = 0;
		System.out.println("Caixa "+numeroCaixa+" iniciou opera��o.");

	} // fim do construtor

	/**
	 * O m�todo iniciarAtendimento simula o atendimento de um cliente.
	 */
	public void iniciarAtendimento()
	{
		numeroCliente = numeroCliente + 1; // o pr�ximo cliente ser� chamado
		System.out.print("Cliente com a senha n�mero "+numeroCliente+", favor ");
		System.out.println("dirigir-se ao caixa n�mero "+numeroCaixa+".");
	}


}
