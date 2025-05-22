package SistemaDePedidos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoLivroTest {

    @Test
    void devePassarNome()
    {
        ProdutoLivro produto = new ProdutoLivro("Dom Casmurro" , 90.0f);
        assertEquals("Dom Casmurro", produto.getNome());
    }

    @Test
    void devePassarPreco()
    {
        ProdutoLivro produto = new ProdutoLivro("Dom Casmurro",90.0f);
        assertEquals(90.0f, produto.getPrecoBase());
    }

    @Test
    void deveLancarExcecaoNomeVazio()
    {
        try{
            ProdutoLivro produto = new ProdutoLivro(" ",90.0f);
        }catch (IllegalArgumentException e)
        {
            assertEquals("O nome não pode ser nulo!", e.getMessage());
        }
    }
    @Test
    void deveLancarExcecaoPrecoInvalido()
    {
        try{
            ProdutoLivro produto = new ProdutoLivro("Dom Casmurro", -1.0f);
        }catch (IllegalArgumentException e)
        {
            assertEquals("O preço não pode ser nulo ou negativo!", e.getMessage());
        }
    }

    @Test
    void deveCalcularPreco()
    {
        ProdutoLivro produto = new ProdutoLivro("Dom Casmurro",90.0f);
        assertEquals(85.5, produto.calcularPreco());
    }
}