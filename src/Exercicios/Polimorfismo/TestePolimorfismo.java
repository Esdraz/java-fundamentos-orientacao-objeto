package Exercicios.Polimorfismo;

public class TestePolimorfismo {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.setSaldo(4000);
        TestePolimorfismo.imprimirSaldo(conta);
        System.out.println();
        // ------------------------------------------------------
        Conta contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(3500);
        imprimirSaldo(contaCorrente);
        System.out.println();
        // ------------------------------------------------------
        Conta contaPoucanca = new ContaPoucanca();
        contaPoucanca.setSaldo(2000);
        imprimirSaldo(contaPoucanca);
    }

    public static void imprimirSaldo(Conta conta) {
        System.out.println("Saldo da conta: R$" + conta.getSaldo());

        if (conta instanceof ContaCorrente) {
            ContaCorrente cc = (ContaCorrente) conta;
            System.out.println("O limite da cc é R$" + cc.getLimite());
        }

        if (conta instanceof ContaPoucanca) {
            ContaPoucanca cp = (ContaPoucanca) conta;
            System.out.println("O rendimento da cp é R$" + cp.getRendimentos());
        }
    }
}
