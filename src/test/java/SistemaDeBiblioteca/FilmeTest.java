package SistemaDeBiblioteca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FilmeTest {
    @Test
    void deveLancarExcecaoParaTituloVazio() {
        try {
            new Filme("", "2001-12-19");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Título não pode ser vazio", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoParaDataVazia() {
        try {
            new Filme("O Senhor dos Anéis", "");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data de publicação não pode ser vazia", e.getMessage());
        }
    }

    @Test
    void deveCalcularDataDevolucaoCorretamente() {
        Filme filme = new Filme("O Senhor dos Anéis", "2001-12-19");
        assertEquals("A data de devolução do filme é em 5 dias após 2023-01-01", filme.calcularDataDevolucao("2023-01-01"));
    }
}
