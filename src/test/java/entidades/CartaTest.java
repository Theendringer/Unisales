package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import entidades.Carta;
import entidades.Baralho;

public class CartaTest {

    @Test
	void PesoDaCartaCorreto() {
		Baralho baralho = new Baralho();
		Carta carta = baralho.obterCarta("C", "10");
		assertEquals(carta.getPeso(), 10);
	}
    
}
