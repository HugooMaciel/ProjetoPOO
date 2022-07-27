package Conta;

public class ContaInvestimento extends Conta {

    public ContaInvestimento() {
    }

    public ContaInvestimento(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void deposito(double valor, double taxaInvestimento) {
        this.setSaldo(getSaldo() + valor);
        double aux = this.getSaldo();
        for (int i = 0; i < 6; i++) {
            aux = aux * (1 + taxaInvestimento);
            System.out.printf("Seu saldo total será, em %d meses, de: $%.2f. \n", (i+1), aux);
        }
    }
}
