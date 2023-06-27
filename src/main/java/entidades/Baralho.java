package entidades;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Baralho {

	private int tamanhoMonte;
	private List<Carta> monte;
	private boolean ehEmbaralhar;

	public Baralho() {
		String[] vetNype = { "Copas", "Espada", "Ouro", "Paus" };

		String[] vetFaces = { "As", "2", "3", "4", "5", "6", "7", "Q", "J", "K" };
		int[] vetPesos = { 11, 0, 0, 0, 0, 0, 10, 4, 3, 2 };

		this.monte = new ArrayList<>();

		for (int i = 0; i < vetNype.length; i++) {
			for (int j = 0; j < vetFaces.length; j++) {
				this.monte.add(new Carta(vetNype[i], vetFaces[j], vetPesos[j]));
			}
		}

		this.tamanhoMonte = 41;
	}

	public Carta obterCarta(String string, String string2) {

		return new Carta("C", "10", 10);
	}

	public int tamanhoMonte() {
		System.out.println("tamanho: " + tamanhoMonte);
		return this.tamanhoMonte;
	}
	
	public Carta comprarCarta() {
		try {
			return comprarCartaException();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private Carta comprarCartaException() throws Exception  {
		this.tamanhoMonte--;
		if(this.tamanhoMonte == 0) {
			throw new Exception("fim do baralho");
		}
		return obterCartaNaPosicao(0);
	}

	public Carta obterCartaNaPosicao(int pos) {
		if (this.ehEmbaralhar) {
			if(this.tamanhoMonte == 1) {
				Carta c = this.monte.get(0);
				this.monte.remove(0);
				return c;
			}
			int idx = prox();
			Carta c = this.monte.get(idx);
			this.monte.remove(idx);
			return c;
		} else {
			Carta c = this.monte.get(pos);
			this.monte.remove(pos);
			return c;

		}
	}

	private int prox() {
		return (int) Math.floor(Math.random() * this.tamanhoMonte);
		
	}

	public void embaralhar() {
		this.ehEmbaralhar = true;

	}
	public String getCarta(Carta c) {		
		return c.toString();
	}
	

	public Carta sortearTrunfo() { 
		
		Random random = new Random();
		int sort = random.nextInt(40);
		Carta c = this.monte.get(sort);
		return c;	
	}
	
}
