
package entidades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Jogador {
	List<Carta> cartas;
	Carta jogada;
	Carta selecionada;

	public Jogador() {
		super();
		cartas = new ArrayList<>();
	}

	public void comprarCarta(Baralho b) {
		Carta c = b.comprarCarta();
		cartas.add(c);
	}

	public int contarPontos() {
		int acc = 0;
		for (Carta carta : cartas) {
			acc += carta.getPeso();
		}
		return acc;
	}
		
	
	public void getCarta() {
		cartas.get(0);
	}
	
	public Carta jogarCarta() {
		return cartas.get(0);
	}
	
	
	public void jogarCartaPosicao(int pos) {	
		jogada = cartas.get(pos);
		cartas.remove(pos);
	}
	
	public Carta cartaJogada() {
		System.out.println(jogada);
		return jogada;
	}
	
	public void selecionarCartaPosicao(int pos) {	
		selecionada = cartas.get(pos);
	}
	
	public Carta cartaSelecionada() {
				return selecionada;
		
	}
	public String mostrarCartas() {
		return cartas.toString();
	}
	
	public void getCartasJogador() {
		System.out.println(cartas.toString());
	}
}
