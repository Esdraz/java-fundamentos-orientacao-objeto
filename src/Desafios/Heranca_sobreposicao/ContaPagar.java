package Desafios.Heranca_sobreposicao;

public class ContaPagar extends Conta {

    private Fornecedor fornecedor;

    private ContaPagar() {
    }

    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
        super(descricao, valor, dataVencimento, SituacaoConta.PENDENTE);
        this.fornecedor = fornecedor;

    }


    public void pagar() {
        setSituacaoConta(SituacaoConta.PAGA);
        System.out.println("Pagando conta: " + this.getDescricao()
                + " no valor de " + this.getValor()
                + " e vencimento em " + this.getDataVencimento()
                + " do fornecedor: " + getFornecedor().getNome());
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}


