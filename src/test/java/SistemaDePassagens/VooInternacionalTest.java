package SistemaDePassagens;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VooInternacionalTest {

    @Test
    void deveLancarExcecaoOrigemVazia() {
        try {
            new VooInternacional(" ", "Nova York", 8000.0f, "2023-12-20", 3.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Origem inválida! Está vazia.", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoDestinoVazio() {
        try {
            new VooInternacional("São Paulo", " ", 8000.0f, "2023-12-20", 3.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Destino inválido! Está vazio.", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoDistanciaInvalida() {
        try {
            new VooInternacional("São Paulo", "Nova York", -8000.0f, "2023-12-20", 3.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Distância inválida! A distância não pode ser nula ou negativa.", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoDataVazia() {
        try {
            new VooInternacional("São Paulo", "Nova York", 8000.0f, " ", 3.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Data inválida! Está vazia.", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoPrecoInvalido() {
        try {
            new VooInternacional("São Paulo", "Nova York", 8000.0f, "2023-12-20", -3.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Preço inválido! O preço não pode ser nulo ou negativo.", e.getMessage());
        }
    }

    @Test
    void deveLancarExcecaoTaxaConversaoInvalida() {
        VooInternacional voo = new VooInternacional("São Paulo", "Nova York", 8000.0f, "2023-12-20", 3.0f);
        try {
            voo.setTaxaDeConversao(-50.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Taxa de conversão inválida! A taxa de conversão não pode ser nula ou negativa.", e.getMessage());
        }
    }

    @Test
    void deveCalcularPrecoCorretamente() {
        VooInternacional voo = new VooInternacional("São Paulo", "Nova York", 8000.0f, "2023-12-20", 3.0f);
        voo.setTaxaDeConversao(50.0f);
        assertEquals(24050.0f, voo.calcularPreco());
    }

    @Test
    void deveCalcularPrecoSemTaxa() {
        VooInternacional voo = new VooInternacional("São Paulo", "Nova York", 8000.0f, "2023-12-20", 3.0f);
        assertEquals(24000.0f, voo.calcularPreco());
    }
}
