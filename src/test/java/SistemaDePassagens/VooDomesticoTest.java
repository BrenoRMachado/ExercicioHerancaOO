package SistemaDePassagens;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VooDomesticoTest {

    @Test
    void deveCalcularPrecoCorretamente() {
        VooDomestico voo = new VooDomestico("São Paulo", "Rio de Janeiro", 400.0f, "2023-12-15", 2.5f);
        assertEquals(1000.0f, voo.calcularPreco());
    }

    @Test
    void deveLancarExcecaoOrigemVazia() {
        try {
            new VooDomestico(" ", "Rio de Janeiro", 400.0f, "2023-12-15", 2.5f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Origem inválida! Está vazia.", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoDestinoVazio() {
        try {
            new VooDomestico("São Paulo", " ", 400.0f, "2023-12-15", 2.5f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Destino inválido! Está vazio.", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoDistanciaInvalida() {
        try {
            new VooDomestico("São Paulo", "Rio de Janeiro", -100.0f, "2023-12-15", 2.5f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Distância inválida! A distância não pode ser nula ou negativa.", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoDataVazia() {
        try {
            new VooDomestico("São Paulo", "Rio de Janeiro", 400.0f, " ", 2.5f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data inválida! Está vazia.", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoPrecoInvalido() {
        try {
            new VooDomestico("São Paulo", "Rio de Janeiro", 400.0f, "2023-12-15", -2.5f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Preço inválido! O preço não pode ser nulo ou negativo.", e.getMessage());
        }
    }
}