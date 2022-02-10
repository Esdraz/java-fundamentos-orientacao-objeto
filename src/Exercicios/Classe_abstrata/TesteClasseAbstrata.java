package Exercicios.Classe_abstrata;

public class TesteClasseAbstrata {

    public static void main(String[] args) {

        Produto p = new ProdutoPerecivel();
        p.descricao = "Caixa de leite";

        ProdutoPerecivel pp = (ProdutoPerecivel) p;
        pp.dataValidade = "15/02/2022";

        p.imprimirDescricao();
    }
}
