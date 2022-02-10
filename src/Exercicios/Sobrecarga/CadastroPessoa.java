package Exercicios.Sobrecarga;

public class CadastroPessoa {


    public void cadastrar(Pessoa pessoa) {
        armazenar(pessoa.getNome(), pessoa.getIdade());
    }

    // Sobrecarga do método cadastrar
    public void cadastrar(String nome, int idade) {
        armazenar(nome, idade);
    }

    private void armazenar(String nome, int idade) {
        //Salvando no banco de dados...
        System.out.println("Salvando: \"" + nome + "\" com " + idade + " anos.");
    }
}
