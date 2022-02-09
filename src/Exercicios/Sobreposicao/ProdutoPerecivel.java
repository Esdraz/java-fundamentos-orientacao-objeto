package Exercicios.Sobreposicao;

import java.util.Date;

public class ProdutoPerecivel extends Produto{

    protected Date dataValidade;

    public void identificar() {

        super.identificar(); //chama o método da superclasse (Produto) | Sobreposição de métodos
        System.out.println("Minha data de validade é: " + dataValidade);
    }
}
