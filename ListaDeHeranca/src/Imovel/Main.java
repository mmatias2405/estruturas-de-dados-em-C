package Imovel;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Imovel> imoveis = new ArrayList<Imovel>();
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		boolean run = true;
		int opcao = -1, tipo = 0;
		while(run) {
			try {
				System.out.println("Digite 1 para registrar um imovel");
				System.out.println("Digite 2 para listar imoveis");
				System.out.println("Digite 0 para sair");
				opcao = Integer.parseInt(teclado.readLine());
				switch(opcao) {
					case 0:
						run = false;
						System.out.println("Saindo ...");
						break;
					case 1:
						System.out.println("Digite o endereço:");
						String ende = teclado.readLine();
						System.out.println("Digite o preco do imovel:");
						Double preco = Double.parseDouble(teclado.readLine());
						System.out.println("Qual tipo de imovel");
						System.out.println("1 - Novo");
						System.out.println("2 - Velho");
						tipo = Integer.parseInt(teclado.readLine());
						switch(tipo) {
							case 1:
								Novo n = new Novo();
								n.setPreco(preco);
								n.setEndereco(ende);
								System.out.println("Digite o Valor Adicional:");
								double valorAd = Double.parseDouble(teclado.readLine());
								n.setValorAdicional(valorAd);		
								imoveis.add(n);
								System.out.println("Imovel Registrado!");
								break;
							case 2:
								Velho v = new Velho();
								v.setPreco(preco);
								v.setEndereco(ende);
								System.out.println("Digite o Desconto:");
								double desconto = Double.parseDouble(teclado.readLine());
								v.setDesconto(desconto);		
								imoveis.add(v);
								System.out.println("Imovel Registrado!");
								break;
							default:
								System.out.println("TIPO INVALIDO");
								System.out.println("TENTE NOVAMENTE");
								break;
						}
						break;						
					case 2:
						for(Imovel aux: imoveis) {
							if(aux instanceof Novo) {
								Novo n = (Novo) aux;
								System.out.println(n);
								continue;
							}
							Velho v = (Velho) aux;
							System.out.println(v);
							continue;
						}
						break;
					default:
						System.out.println("OPCAO INVALIDA");
						System.out.println("TENTE NOVAMENTE");
						break;
			
				}
			}catch (Exception e) {
				System.out.println("ERRO DE LEITURA");
				System.out.println("TENTE NOVAMENTE");
			} 
		}

	}

}
