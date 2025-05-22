package SistemaDePagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    @Test
    void deveCalcularPagamento(){
        Diretor diretor = new Diretor();
        diretor.setSalarioMensal(2000);
        diretor.setParticipacao(4000);
        diretor.calcularPagamento();
        assertEquals(6000, diretor.calcularPagamento());
    }

    @Test
    void deveLancarExcecaoParticipacaoInvalida()
    {
        try{
            Diretor diretor = new Diretor();
            diretor.setSalarioMensal(2000);
            diretor.setParticipacao(0);
            diretor.calcularPagamento();
        }
        catch (IllegalArgumentException e)
        {
            assertEquals("A participação não pode ser negativa ou nula!", e.getMessage());
        }

    }

}