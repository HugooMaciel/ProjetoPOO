package Conta;

public class ContaInvestimento extends Conta {

    private double saldoInvestimento;

    public ContaInvestimento() {
    }

    public ContaInvestimento(String nome, String cpf) {
        super(nome, cpf);
        this.saldoInvestimento = 0;
    }

    public double getSaldoInvestimento() {
        return saldoInvestimento;
    }

    public void setSaldoInvestimento(double saldoInvestimento) {
        this.saldoInvestimento = saldoInvestimento;
    }

    public void investimento(double valor) {
        this.setSaldoInvestimento(getSaldoInvestimento() + valor);
        for (int i = 0; i < 3; i++) {
            this.setSaldoInvestimento(this.getSaldoInvestimento() * (1 + 0.01));
            double rendimento = this.getSaldoInvestimento();
            System.out.println("Seu saldo total será, em " + (i + 1) + " meses, de: $" + rendimento);
        }

    }
}
