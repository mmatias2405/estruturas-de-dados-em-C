package Ingresso;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Ingresso> ingressos = new ArrayList<Ingresso>();
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		boolean run = true;
		double valor = 100.00, valorAd = 50.89;
		int lSup = 1, lInf = 1;
		int opcao = -1, tipo = 0;
		while(run) {
			try {
				System.out.println("Digite 1 para comprar um ingresso");
				System.out.println("Digite 2 para listar os ingressos comprados");
				System.out.println("Digite 0 para sair");
				opcao = Integer.parseInt(teclado.readLine());
				switch(opcao) {
					case 0:
						run = false;
						System.out.println("Saindo ...");
						break;
					case 1:
						System.out.println("Escolha o tipo de ingresso");
						System.out.println("1 - Normal");
						System.out.println("2 - Camarote Superior");
						System.out.println("3 - Camarote Inferior");
						tipo = Integer.parseInt(teclado.readLine());
						switch(tipo) {
							case 1:
								Normal n = new Normal();
								n.setValor(valor);
								ingressos.add(n);
								System.out.println("Compra Realizada!");
								break;
							case 2:
								CamaroteSuperior cs = new CamaroteSuperior();
								cs.setValor(valor);
								cs.setValorAdicional(valorAd);
								cs.setLocalizacao(lSup);
								ingressos.add(cs);
								lSup++;
								System.out.println("Compra Realizada!");
								break;
							case 3:
								CamaroteInferior ci = new CamaroteInferior();
								ci.setValor(valor);
								ci.setValorAdicional(valorAd);
								ci.setLocalizacao(lInf);
								ingressos.add(ci);
								lInf++;
								System.out.println("Compra Realizada!");
								break;
							default:
								System.out.println("TIPO INVALIDO");
								System.out.println("TENTE NOVAMENTE");
								break;
						}
						break;						
					case 2:
						for(Ingresso aux: ingressos) {
							if(aux instanceof Normal) {
								Normal n = (Normal) aux;
								n.tipoIngresso();
								System.out.print(" - ");
								n.imprimeValor();
								System.out.println();
								continue;
							}
							if(aux instanceof CamaroteSuperior) {
								CamaroteSuperior n = (CamaroteSuperior) aux;
								n.imprimeLocalizacao();
								System.out.print(" - ");
								n.imprimeValor();
								System.out.println();
								continue;
							}
							CamaroteInferior n = (CamaroteInferior) aux;
							n.imprimeLocalizacao();
							System.out.print(" - ");
							n.imprimeValor();
							System.out.println();
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
