package Exercicios.Sobrecarga;

public class MaquinaCafe {

    int acucarDisponivel;

    void fazerCafe() {
        fazerCafe(10);
    }

    void fazerCafe(int quantidadeAcucar) {
        if (acucarDisponivel < quantidadeAcucar) {
            System.out.println("Não há açúcar suficiente para fazer o seu café!");
        } else {
            acucarDisponivel -= quantidadeAcucar;
            System.out.println("Fazendo o seu cafezinho com " + quantidadeAcucar + " gramas de açúcar.");
        }
    }
}
