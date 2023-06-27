package entidades;

import java.util.Scanner;

public class Programa {
	
	public static void main(String [] args){ 
	   
	    Scanner sc = new Scanner(System.in);
			
		Baralho b = new Baralho();
		b.embaralhar();
		
		
		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		Jogador j3 = new Jogador();
		Jogador j4 = new Jogador();
			
		Jogo jogo = new Jogo();

	    //iniciar jogo e criar variveis de posição e rodada
		
		
		jogo.iniciaJogo(b, j1, j2, j3, j4);
		
		int pos;
		int rodada = 0;
		
		
		for(int i=0; i<=6;i++) {
			System.out.println("Jogador 1, sua vez!");
			System.out.println("Selecione uma carta");
			jogo.jogada(j1);
			
			
			System.out.println("Jogador 2, sua vez!");
			System.out.println("Selecione uma carta");
			jogo.jogada(j2);
			
			
			System.out.println("Jogador 3, sua vez!");
			System.out.println("Selecione uma carta");
			jogo.jogada(j3);
			
			
			System.out.println("Jogador 4, sua vez!");
			System.out.println("Selecione uma carta");
			jogo.jogada(j4);
			

			
			rodada = i;
			System.out.println(rodada);
			jogo.comprarCartas(b, j1, j2, j3, j4);
			jogo.pontosRodada(j1, j2, j3, j4);
			jogo.verificaRodada(j1, j2, j3, j4);
			jogo.mostrarCartas(j1, j2, j3, j4);
			//jogo.pontosRodada(j1, j2, j3, j4);
			jogo.verificaRodada(j1, j2, j3, j4);
			b.tamanhoMonte();
			
		}
		
		
		rodada = rodada + 1;
		
		switch(rodada) {
		case 7:
			System.out.println("Jogador 1, sua vez!");
			System.out.println("Selecione uma carta");
			jogo.jogada(j1);
			
			
			System.out.println("Jogador 2, sua vez!");
			System.out.println("Selecione uma carta");
			jogo.jogada(j2);
			
			
			System.out.println("Jogador 3, sua vez!");
			System.out.println("Selecione uma carta");
			jogo.jogada(j3);
			
			
			System.out.println("Jogador 4, sua vez!");
			System.out.println("Selecione uma carta");
			jogo.jogada(j4);

            jogo.pontosRodada(j1, j2, j3, j4);
			jogo.verificaRodada(j1, j2, j3, j4);
			rodada += 1;
			jogo.mostrarCartas(j1, j2, j3, j4);
			
			
			
		case 8:
			System.out.println("Jogador 1, sua vez!");
			System.out.println("Selecione uma carta");
			jogo.jogada(j1);
			
			
			System.out.println("Jogador 2, sua vez!");
			System.out.println("Selecione uma carta");
			jogo.jogada(j2);
			
			
			System.out.println("Jogador 3, sua vez!");
			System.out.println("Selecione uma carta");
			jogo.jogada(j3);
			
			
			System.out.println("Jogador 4, sua vez!");
			System.out.println("Selecione uma carta");
			jogo.jogada(j4);
			

			jogo.pontosRodada(j1, j2, j3, j4);
			jogo.verificaRodada(j1, j2, j3, j4);
			rodada += 1;	
			jogo.mostrarCartas(j1, j2, j3, j4);
			
			
			
		case 9:
			System.out.println("Jogador 1, sua vez!");
			System.out.println("Selecione uma carta");
			jogo.jogada(j1);
			
			
			System.out.println("Jogador 2, sua vez!");
			System.out.println("Selecione uma carta");
			jogo.jogada(j2);
			
			
			System.out.println("Jogador 3, sua vez!");
			System.out.println("Selecione uma carta");
			jogo.jogada(j3);
			
			
			System.out.println("Jogador 4, sua vez!");
			System.out.println("Selecione uma carta");
			jogo.jogada(j4);
			
			jogo.pontosRodada(j1, j2, j3, j4);
			jogo.verificaRodada(j1, j2, j3, j4);
			jogo.mostrarCartas(j1, j2, j3, j4);

}
		
		jogo.gerarArquivo();
	    
	}
	
}

