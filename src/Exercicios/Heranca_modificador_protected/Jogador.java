package Exercicios.Heranca_modificador_protected;

//Jogador herda de pessoa (jogador É UMA pessoa)
public class Jogador extends Pessoa{

    protected boolean aindaJoga = false;

    public void dizerSeAindaJoga() {
        System.out.println("Ainda joga? " + aindaJoga);
    }
}
