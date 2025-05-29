package SistemaDeBiblioteca;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LivroTest {
    @Test
    void deveLancarExcecaoParaTituloVazio() {
        try {
            new Livro("", "1899-01-01");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Título não pode ser vazio", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoParaDataVazia() {
        try {
            new Livro("Dom Casmurro", "");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data de publicação não pode ser vazia", e.getMessage());
        }
    }

    @Test
    void deveCalcularDataDevolucaoCorretamente() {
        Livro livro = new Livro("Dom Casmurro", "1899-01-01");
        assertEquals("A data de devolução do livro é em 15 dias após 2023-01-01",
                livro.calcularDataDevolucao("2023-01-01"));
    }
}
