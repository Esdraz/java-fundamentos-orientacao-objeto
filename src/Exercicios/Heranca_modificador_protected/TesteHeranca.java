package Exercicios.Heranca_modificador_protected;

public class TesteHeranca {

    public static void main(String[] args) {

        Jogador j = new Jogador();
        j.nome = "Pedro";
        j.idade = 22;

        j.seApresentar();
        j.dizerSeAindaJoga();
    }
}
