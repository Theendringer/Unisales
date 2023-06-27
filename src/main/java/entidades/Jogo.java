package entidades;

import java.util.ArrayList;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

public class Jogo {
	
	Carta trunfo;
	private int pontosJ1; 
	private int pontosJ2;
	private int pontosJ3;
	private int pontosJ4;
	
	
	ArrayList<Integer> jogo = new ArrayList<Integer>();
	
	
	int sete = 0;
	
	
	List<Carta> rodada;
	public Jogo() {
		super();
		rodada = new ArrayList<>();
	}
	
	public void getTrunfo() {
		System.out.println(trunfo);
	}
	
public void comprarCartas(Baralho b, Jogador j1, Jogador j2, Jogador j3, Jogador j4) {
		
		j1.comprarCarta(b);
		j2.comprarCarta(b);
		j3.comprarCarta(b);
		j4.comprarCarta(b);
		
	}

public void mostrarCartas(Jogador j1, Jogador j2, Jogador j3, Jogador j4) {
	System.out.println("Cartas J1 = " + j1.mostrarCartas() + "  " + "Cartas J2 = " + j2.mostrarCartas() + "\n" + "Cartas J3 = "
			+ j3.mostrarCartas() + "  " + "Cartas J4 = " + j4.mostrarCartas());	
}
	
public void iniciaJogo(Baralho b, Jogador j1, Jogador j2, Jogador j3, Jogador j4) {
	
	j1.comprarCarta(b);
	j1.comprarCarta(b);
	j1.comprarCarta(b);
	
	j2.comprarCarta(b);
	j2.comprarCarta(b);
	j2.comprarCarta(b);
	
	j3.comprarCarta(b);
	j3.comprarCarta(b);
	j3.comprarCarta(b);
	
	j4.comprarCarta(b);
	j4.comprarCarta(b);
	j4.comprarCarta(b);
	

	this.trunfo = b.sortearTrunfo();
	getTrunfo();
	
	mostrarCartas(j1, j2, j3, j4);

}

public int pontosRodada(Jogador j1, Jogador j2, Jogador j3, Jogador j4) {
	int pontos = j1.cartaJogada().getPeso() + j2.cartaJogada().getPeso() + j3.cartaJogada().getPeso() + j4.cartaJogada().getPeso();
	return pontos;
}


public void verificaRodada(Jogador j1, Jogador j2, Jogador j3, Jogador j4) {
	
	if(j1.cartaJogada().getPeso() >= j2.cartaJogada().getPeso() && j2.cartaJogada().getPeso() >= j3.cartaJogada().getPeso() 
			&& j3.cartaJogada().getPeso() >= j4.cartaJogada().getPeso())  {
		
		pontosJ1 += pontosRodada(j1, j2, j3, j4);
		
	} else if(j2.cartaJogada().getPeso() >= j1.cartaJogada().getPeso() && j2.cartaJogada().getPeso() >= j3.cartaJogada().getPeso() &&
			j3.cartaJogada().getPeso() >= j4.cartaJogada().getPeso()){
		
		pontosJ2 += pontosRodada(j1, j2, j3, j4);
		
	}else if(j3.cartaJogada().getPeso() >= j1.cartaJogada().getPeso() && j3.cartaJogada().getPeso() >= j2.cartaJogada().getPeso() &&
			j3.cartaJogada().getPeso() >= j4.cartaJogada().getPeso()) {
		
		pontosJ3 += pontosRodada(j1, j2, j3, j4);
	} else {
		pontosJ4 += pontosRodada(j1, j2, j3, j4);
	}
	
}

public String vencedor() {
	if(pontosJ1 > pontosJ2 && pontosJ2 > pontosJ3 && pontosJ3 > pontosJ4) {
		
		System.out.println("Jogador 1 venceu!");
		return "Jogador 1 venceu!";
		
	} else if (pontosJ2 > pontosJ3 && pontosJ3 > pontosJ4) {
		
		System.out.println("Jogador 2 venceu!");
		return "Jogador 2 venceu!";
		
	} else if(pontosJ3 > pontosJ4) {
		
		System.out.println("Jogador 3 venceu!");
		return "Jogador 3 venceu!";
		
	} else {
		System.out.println("Jogador 4 venceu!");
		return "Jogador 4 venceu!";
	}
}


public void gerarArquivo() {
	 File arquivo = new File("bisca.txt");
	 
	 try {
           FileWriter escritor = new FileWriter(arquivo);
           escritor.write("Pontos J1 = " + pontosJ1 +  "\n" + "Pontos J2 = " + pontosJ2 + "\n" + 
           "Pontos J3 = " + pontosJ3 + "\n" + "Pontos J4 = " + pontosJ4 + "\n" + vencedor());
           escritor.close();
           System.out.println("Arquivo criado com sucesso!");
       } catch (IOException e) {
           System.out.println("Ocorreu um erro ao criar o arquivo: " + e.getMessage());
       }
}



public void verificaSete(Jogador jogador) {
	
	if(jogador.cartaSelecionada().getPeso() == 10) {
		sete = 1;
	}

}


public void verificaAs(Jogador jogador) {
	
	if(jogador.cartaSelecionada().getPeso() == 11 && sete != 1) {
		
	}
	
	
}

public void jogada(Jogador jogador) {
	
	
	
	
	
	int pos = 0;
	
	jogador.selecionarCartaPosicao(pos);
	jogador.cartaSelecionada();
	
	verificaSete(jogador);
	
	if(jogador.cartaSelecionada().getPeso() == 11 && sete != 1) {
		
		System.out.println("Ás não pode sair antes do 7");
		System.out.println("Jogue outra carta.");
		
		pos = 0;
		jogador.jogarCartaPosicao(pos);
		jogador.cartaJogada();
		
	}else {
		jogador.jogarCartaPosicao(pos);
		jogador.cartaJogada();
	}
	

}

}
