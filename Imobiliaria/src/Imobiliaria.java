import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Imobiliaria {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Cadastro cadastro = new Cadastro();
		int resp;
		while(true)
		{
			System.out.println("\n\n\t\t\t\tMENU:");
			System.out.println("1.Cadastrar imóvel");
			System.out.println("2.Cadastrar cliente");
			System.out.println("3.Buscar imóvel");
			System.out.println("4.Buscar cliente");
			System.out.println("5.Sair");
			System.out.print("Resposta: ");
			try {
				resp = Integer.parseInt(reader.readLine());
				switch (resp) {
				case 1:
					System.out.print("Operacao: Novo imóvel\nDigite o endereco: ");
					String endereco = reader.readLine().toUpperCase();
					System.out.print("Digite a metragem em M²: ");
					float metragem = Float.parseFloat(reader.readLine());
					System.out.print("Está a venda? [y/n]: ");
					char vendese = reader.readLine().toUpperCase().charAt(0);					
					cadastro.cadastrarImovel(new Imovel(endereco, metragem, vendese == 'Y'? true : false));
					break;
				case 2:
					System.out.print("Operacao: Novo cliente\nDigite o nome: ");
					String nome = reader.readLine().toUpperCase();
					System.out.print("Digite o endereco: ");
					String enderecoC = reader.readLine().toUpperCase();
					System.out.print("Digite o telefone: ");
					String telefone = reader.readLine().toUpperCase();
					System.out.print("Digite o RG: ");
					String rG = reader.readLine().toUpperCase();
					System.out.print("Digite o CPF: ");
					String cPF = reader.readLine().toUpperCase();
					cadastro.cadastrarCliente(new Cliente(nome, enderecoC, telefone, rG, cPF));
					break;
				case 3:
					System.out.print("Operacao: Buscar imóvel\nDigite o endereço desejado: ");
					String enderecoB = reader.readLine().toUpperCase();
					System.out.print(cadastro.buscarImoveis(enderecoB));
					break;
				case 4:
					System.out.print("Operacao: Buscar cliente\nDigite o Nome do cliente: ");
					String nomeB = reader.readLine().toUpperCase();
					System.out.print(cadastro.buscarCliente(nomeB));
					break;
				case 5:
					System.exit(1);
					break;
				default:
					System.out.println("Número inválido, tente novamente:");
					break;
				}
			}
			catch(Exception e){
				System.out.println("Erro de leitura, tente novamente:");
			}
			
		}	
	}

}
