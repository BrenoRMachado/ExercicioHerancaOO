package SistemaDePedidos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoRoupaTest {

    @Test
    void devePassarNome()
    {
        ProdutoRoupa produto = new ProdutoRoupa("Casaco" , 60.0f);
        assertEquals("Casaco", produto.getNome());
    }

    @Test
    void devePassarPreco()
    {
        ProdutoRoupa produto = new ProdutoRoupa("Casaco",60.0f);
        assertEquals(60.0f, produto.getPrecoBase());
    }

    @Test
    void deveLancarExcecaoNomeVazio()
    {
        try{
            ProdutoRoupa produto = new ProdutoRoupa(" ",60.0f);
        }catch (IllegalArgumentException e)
        {
            assertEquals("O nome não pode ser nulo!", e.getMessage());
        }
    }
    @Test
    void deveLancarExcecaoPrecoInvalido()
    {
        try{
            ProdutoRoupa produto = new ProdutoRoupa("Casaco", -1.0f);
        }catch (IllegalArgumentException e)
        {
            assertEquals("O preço não pode ser nulo ou negativo!", e.getMessage());
        }
    }

    @Test
    void deveCalcularPreco()
    {
        ProdutoRoupa produto = new ProdutoRoupa("Casaco",60.0f);
        assertEquals(48, produto.calcularPreco());
    }

}