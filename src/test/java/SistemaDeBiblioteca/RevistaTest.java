package SistemaDeBiblioteca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RevistaTest {
    @Test
    void deveLancarExcecaoParaTituloVazio() {
        try {
            new Revista("", "2023-11-01");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Título não pode ser vazio", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoParaDataVazia() {
        try {
            new Revista("Veja", "");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data de publicação não pode ser vazia", e.getMessage());
        }
    }

    @Test
    void deveCalcularDataDevolucaoCorretamente() {
        Revista revista = new Revista("Veja", "2023-11-01");
        assertEquals("A data de devolução da revista é em 7 dias após 2023-12-01",
                revista.calcularDataDevolucao("2023-12-01"));
    }
}