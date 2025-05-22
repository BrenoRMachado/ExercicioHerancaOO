package SistemaDePagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioComumTest {

    @Test
    void deveCalcularPagamento(){
        FuncionarioComum funcionario = new FuncionarioComum();
        funcionario.setSalarioMensal(2000);
        funcionario.calcularPagamento();
        assertEquals(2000, funcionario.calcularPagamento());
    }

    @Test
    void deveLancarExcecaoSalarioInvalido(){
        try{
            FuncionarioComum funcionario = new FuncionarioComum();
            funcionario.setSalarioMensal(0);
            funcionario.calcularPagamento();
        }
        catch (IllegalArgumentException e){
            assertEquals("O salario não pode ser negativo ou nulo!", e.getMessage());
        }
    }

}