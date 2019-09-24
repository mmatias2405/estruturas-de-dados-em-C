
public class Jogo {

	public static void main(String[] args) {
		
		//cria o objeto do tipo personagem "Mário"
		Personagem mario = new Personagem();
		mario.setNome("Mario");
		mario.setCor("Vermelho");
		mario.setQuantidadeDeCogumelos(0);
		mario.setAltura(1.60f);
		mario.setTipoFisico("Gordinho");
		mario.setPossuiBigode(true);
		
		//cria o objeto do tipo Personagem "Luigi"
		Personagem luigi = new Personagem();
		luigi.setNome("Luigi");
		luigi.setCor("Verde");
		luigi.setQuantidadeDeCogumelos(0);
		luigi.setAltura(1.80f);
		luigi.setTipoFisico("Magro");
		luigi.setPossuiBigode(true);
		
		//manda mensagens para o objeto "Mario"
		System.out.println(mario.toString());
		mario.pular();
		mario.pegarCogumelo(new Cogumelo());
		mario.atirarFogo();
		System.out.println();
		
		
		//manda mensagens para o objeto "Luigi"
		System.out.println(luigi.toString());
		luigi.pular();
		luigi.pegarCogumelo(new Cogumelo());
		luigi.atirarFogo();
		System.out.println();
		
		//faz testes de identidade e igualdade
		System.out.println("mario == luigi -> " + ( mario == luigi ));
		System.out.println("mario.equals(luigi) -> " + mario.equals(luigi));
		System.out.println("mario.hashCode() -> " + mario.hashCode());
		System.out.println("luigi.hashCode() -> " + luigi.hashCode());

	}

}
