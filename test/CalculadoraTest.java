import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void diferenca() {
        Calculadora dif = new Calculadora();
        assertEquals(5,dif.diferenca(10,5));
    }

    @Test
    void divisao() {
        Calculadora div = new Calculadora();
        assertEquals(5,div.divisao(10,2));
    }

    @Test
    void produto() {
        Calculadora prod = new Calculadora();
        assertEquals(20,prod.produto(10,2));
    }

    @Test
    void soma() {
        Calculadora soma = new Calculadora();
        assertEquals(20,soma.soma(10,10));
    }
}