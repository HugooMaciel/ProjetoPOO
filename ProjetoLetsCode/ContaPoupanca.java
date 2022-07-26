package Conta;

public class ContaPoupanca extends Conta {
    
    private double saldoPoupanca;

    public ContaPoupanca() {
    }

    public ContaPoupanca(String nome, String cpf) {
        super(nome, cpf);
        this.saldoPoupanca = 0;
    }

    public double getSaldoPoupanca() {
        return saldoPoupanca;
    }

    public void setSaldoPoupanca(double saldoPoupanca) {
        this.saldoPoupanca = saldoPoupanca;
    }
    
}
