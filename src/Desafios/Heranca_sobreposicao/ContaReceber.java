package Desafios.Heranca_sobreposicao;

public class ContaReceber extends Conta {

    private Cliente cliente;

    private ContaReceber() {
    }

    public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
        super(descricao, valor, dataVencimento, SituacaoConta.PENDENTE);
        this.cliente = cliente;
    }

    public void cancelar() {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode cancelar uma conta que já foi paga: "
                    + this.getDescricao() + ".");
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode cancelar uma conta que já foi cancelada: "
                    + this.getDescricao() + ".");
        } else if (this.getValor() >= 50000) {
            System.out.println("Não é possível cancelar conta com valor acima de R$ 50.000,00!");
        } else {
            System.out.println("Cancelando conta " + this.getDescricao() + ".");

            // altera situação da conta para CANCELADA
            this.situacaoConta = SituacaoConta.CANCELADA;
        }
    }

    public void receber() {
        setSituacaoConta(SituacaoConta.PAGA);
        System.out.println("Pagando conta: " + this.getDescricao()
                + " no valor de " + this.getValor()
                + " e vencimento em " + this.getDataVencimento()
                + " do cliente: " + getCliente().getNome());
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
