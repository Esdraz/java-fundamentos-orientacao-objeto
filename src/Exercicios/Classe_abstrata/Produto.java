package Exercicios.Classe_abstrata;

public abstract class Produto {

    String descricao;

    //Método abstrato
    public abstract void imprimirDescricao();

    public String getDescricao() {
        return descricao;
    }
}
