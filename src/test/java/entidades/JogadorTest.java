package teste;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

import entidades.Baralho;
import entidades.Carta;
import entidades.Jogador;

class JogadorTest {

	@Test
	void sabeComprarAprimeiraCartaOrdenada() {
		Baralho b = new Baralho();
		Jogador j1 = new Jogador();
		j1.comprarCarta(b);

		assertEquals(11, j1.contarPontos());
	}
	
	
	@Test
	void sabeComprarTresCartasOrdenadas() {
		Baralho b = new Baralho();
		Jogador j1 = new Jogador();
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		
		assertEquals(11, j1.contarPontos());
	}
	
	
	@Test
	void sabeComprarDezCartasOrdendas() {
		Baralho b = new Baralho();
		Jogador j1 = new Jogador();
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		
		assertEquals(30, j1.contarPontos());
	}
	
	@Test
	void sabeComprarCartaAleatoria() {
		Baralho b = new Baralho();
		b.embaralhar();
		Jogador j1 = new Jogador();
		
		j1.comprarCarta(b);
		
		assertNotEquals(11, j1.contarPontos());	
	}
	
	@Test
	void sabeComprarTodasCartas() {
		Baralho b = new Baralho();
		Jogador j1 = new Jogador();
		
		for(int i =0; i <= 39; i++) {
			j1.comprarCarta(b);
		}
		
		assertEquals(120, j1.contarPontos());
	}
	
	
	@Test
	void doisJogadoresComprandoCartaOrdenadasDiferentes() {
		Baralho b = new Baralho();
		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		
		j1.comprarCarta(b);
		j2.comprarCarta(b);
		
		assertEquals(11, j1.contarPontos());
		assertEquals(0, j2.contarPontos());
		
	}
	
	
	@Test
	void doisJogadoresComprandoCartasDiferentesEmbaralhado() {
		Baralho b = new Baralho();
		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		b.embaralhar();
		
		j1.comprarCarta(b);
		j2.comprarCarta(b);
		
		assertNotEquals(j2.contarPontos(), j1.contarPontos());
	}
	
	
	void quatroJogadoresComprandoCartasDiferentesEmbaralhado() {
		Baralho b = new Baralho();
		Jogador j1 = new Jogador();
		Jogador j2 = new Jogador();
		Jogador j3 = new Jogador();
		Jogador j4 = new Jogador();
		b.embaralhar();
		
		j1.comprarCarta(b);
		j2.comprarCarta(b);
		j3.comprarCarta(b);
		j4.comprarCarta(b);
		
		assertNotEquals(j1.contarPontos(), j2.contarPontos());
		assertNotEquals(j1.contarPontos(), j3.contarPontos());
		assertNotEquals(j1.contarPontos(), j4.contarPontos());
		
		assertNotEquals(j2.contarPontos(), j3.contarPontos());
		assertNotEquals(j2.contarPontos(), j4.contarPontos());
		
		
		assertNotEquals(j3.contarPontos(), j4.contarPontos());
		
	}
	
	@Test
	void jogarCarta() {
		Baralho b = new Baralho();
		Jogador j1 = new Jogador();
		
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		
		
		j1.jogarCarta();
		
		assertEquals(0, j1.contarPontos());
	}
	
	
	@Test
	void jogarCartas2() {
		Baralho b = new Baralho();
		Jogador j1 = new Jogador();
		
		j1.comprarCarta(b);
		j1.jogarCarta();
		
		assertNotEquals(11, j1.contarPontos());
	}
	
	
	@Test
	void jogarPrimeiraSegundaCarta() {
		Baralho b = new Baralho();
		Jogador j1 = new Jogador();
		
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		
		
		j1.jogarCartaPosicao(0);
		j1.jogarCartaPosicao(1);
		
		
		assertEquals(0, j1.contarPontos());
		
	}
	
	@Test
	void jogarSegundaTerceiraCarta() {
		Baralho b = new Baralho();
		Jogador j1 = new Jogador();
		
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		
		
		j1.jogarCartaPosicao(1);
		j1.jogarCartaPosicao(1);
		
		
		assertEquals(11, j1.contarPontos());
		
	}
	
	@Test
	void testeJogadas() {
		
		Baralho b = new Baralho();
		Jogador j1 = new Jogador();
		
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		j1.comprarCarta(b);
		
		
		j1.jogarCartaPosicao(1);
		
		assertEquals(10, j1.contarPontos());
		
	}
	
}
