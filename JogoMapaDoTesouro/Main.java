package teste;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//inicializa as classes
		Scanner input = new Scanner(System.in);
		Mapa mp = new Mapa();
		final int maxTesouro = 8; 
		Jogo jg = new Jogo(25, maxTesouro, 5);//tentativas, tesouros, armadilhas;
		
		
		//inicia o jogo
		jg.iniciar(mp);
		
		//enquanto o número de tentativas ou o jogador não achar todos os tesouros
		while(jg.getTentativas() > 0 && jg.getTesourosEncontrados() < maxTesouro) {
			//mostra o mapa visual
			mp.mostrarMapa();
			//diz o número total de tentativas restantes
			System.out.println("Você tem "+jg.getTentativas()+" tentativas");
			
			//pede as coordenadas da escavação
			System.out.println("Digite a linha da escavação");
			jg.setX(numeroPossivel(input.nextInt()));
			System.out.println("Digite a coluna de escavação");
			jg.setY(numeroPossivel(input.nextInt()));

			//verifica se a escavação está disponível
			if(jg.verificarEscavacao(mp)) {
				//adiciona a pontuação se achou algo com a escavação
				jg.setPontuacao(jg.getPontuacao() + jg.cavar(mp));
				//diminui uma tentativa
				jg.setTentativas(jg.getTentativas()-1);
			}		
		}
		//finaliza o jogo
		jg.finalizar(mp);
	}

	//faz com que o número ditado esteja entre 0 e 7(coordenadas disponiveis) e retorna
	public static int numeroPossivel(int a) {
		Scanner input = new Scanner(System.in);
		//enquanto o número não estiver entre 0 e 7 ele pedirá para dar uma coordenada válida
		while(a < 0 || a > 7) {
			System.out.println("Esta coordenada nao existe. Tente novamente: ");
			a = input.nextInt();
		}
		return a;
	}
}

