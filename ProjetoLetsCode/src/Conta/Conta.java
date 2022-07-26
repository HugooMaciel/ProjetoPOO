package Conta;

import Cliente.PessoaFisica;

public abstract class Conta {

    private static int numeroDaConta;
    private String nome;
    private String cpf;
    private double saldo;

    public static int getNumeroDaConta() {
        return numeroDaConta;
    }

    public Conta() {
    }

    public Conta(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public static void setNumeroDaConta(int numeroDaConta) {
        Conta.numeroDaConta = numeroDaConta;
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

    public void deposito(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    public void saque(double valor) {

        if (valor > this.getSaldo()) {
            System.out.println("Nao pode!");
        } else {
            this.setSaldo(this.getSaldo() - valor);
        }
    }

    public void transferencia(PessoaFisica contaDestino, double valor) {
        if (valor > this.getSaldo()) {
            System.out.println("Nao pode!");
        } else {
            this.setSaldo(this.getSaldo() - valor);
            contaDestino.getContaCorrente().setSaldo(contaDestino.getContaCorrente().getSaldo() + valor);
        }
    }

}