package SistemaDePedidos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoEletronicoTest {

    @Test
    void devePassarNome()
    {
        ProdutoEletronico produto = new ProdutoEletronico("Notebook",1000.0f);
        assertEquals("Notebook", produto.getNome());
    }

    @Test
    void devePassarPreco()
    {
        ProdutoEletronico produto = new ProdutoEletronico("Notebook",1000.0f);
        assertEquals(1000.0f, produto.getPrecoBase());
    }

    @Test
    void deveLancarExcecaoNomeVazio()
    {
        try{
            ProdutoEletronico produto = new ProdutoEletronico(" ",1000.0f);
        }catch (IllegalArgumentException e)
        {
            assertEquals("O nome não pode ser nulo!", e.getMessage());
        }
    }
    @Test
    void deveLancarExcecaoPrecoInvalido()
    {
        try{
            ProdutoEletronico produto = new ProdutoEletronico("Notebook", -1.0f);
        }catch (IllegalArgumentException e)
        {
            assertEquals("O preço não pode ser nulo ou negativo!", e.getMessage());
        }
    }

    @Test
    void deveCalcularPreco()
    {
        ProdutoEletronico produto = new ProdutoEletronico("Notebook",1000.0f);
        assertEquals(900, produto.calcularPreco());
    }

}