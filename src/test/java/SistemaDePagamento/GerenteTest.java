package SistemaDePagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GerenteTest {

    @Test
    void deveCalcularPagamento()
    {
        Gerente gerente = new Gerente();
        gerente.setSalarioMensal(2000);
        gerente.setBonus(10);
        gerente.calcularPagamento();
        assertEquals(2200, gerente.calcularPagamento());
    }
    @Test
    void deveLancarExcecaoBonusInvalido()
    {
        try{
            Gerente gerente = new Gerente();
            gerente.setSalarioMensal(2000);
            gerente.setBonus(-10);
            gerente.calcularPagamento();
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("O bonus não pode ser negativo ou nulo!" , e.getMessage());
        }

    }
}