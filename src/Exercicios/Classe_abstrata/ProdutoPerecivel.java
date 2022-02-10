package Exercicios.Classe_abstrata;

public class ProdutoPerecivel extends Produto{

    String dataValidade;

    @Override
    public void imprimirDescricao() {
        //Digitar a lógica
        System.out.println("Descrição: " + super.getDescricao() + ". Vencido em: " + dataValidade + ".");
    }
}
