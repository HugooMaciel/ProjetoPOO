package Conta;

import Cliente.PessoaFisica;

public abstract class Conta {

    private static int qtdConta;
    private int numeroDaConta;
    private String nome;
    private String cpf;
    private double saldo;

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public Conta() {
    }

    public Conta(String nome, String cpf) {
        Conta.qtdConta++;
        this.numeroDaConta = qtdConta;
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 10;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void deposito(double valor, double taxaInvestimento) {
        this.setSaldo(this.getSaldo() + valor);
    }

    public void saque(double valor, double taxa) {

        if (valor > this.getSaldo()) {
            System.out.println("Nao pode!");
        } else {
            this.setSaldo(this.getSaldo() - valor*(1+taxa));
        }
    }

    public void transferencia(PessoaFisica contaDestino, double valor, double taxa) {
        if (valor > this.getSaldo()) {
            System.out.println("Nao pode!");
        } else {
            this.setSaldo(this.getSaldo() - valor*(1+taxa));
            contaDestino.getContaCorrente().setSaldo(contaDestino.getContaCorrente().getSaldo() + valor);
        }
    }
}