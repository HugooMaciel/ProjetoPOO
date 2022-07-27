package Cliente;

import Conta.ContaCorrente;
import Conta.ContaInvestimento;

public abstract class Cliente {

    private String nome;
    private String cpf;
    private double taxa;
    private double taxaInvestimento;

    protected ContaCorrente contaCorrente;
    private ContaInvestimento contaInvestimento;

    public Cliente() {
    }

    public Cliente(String nome, String cpf) {
        this.contaCorrente = new ContaCorrente(nome,cpf);
        this.contaCorrente.setSaldo(30);
        this.nome = nome;
        this.cpf = cpf;
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

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getTaxaInvestimento() {
        return taxaInvestimento;
    }

    public void setTaxaInvestimento(double taxaInvestimento) {
        this.taxaInvestimento = taxaInvestimento;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public ContaInvestimento getContaInvestimento() {
        return contaInvestimento;
    }

    public void setContaInvestimento(ContaInvestimento contaInvestimento) {
        this.contaInvestimento = contaInvestimento;
    }

    public void criarContaInvestimento(String nome, String cpf) {
        this.contaInvestimento = new ContaInvestimento(nome, cpf);
        this.contaInvestimento.setSaldo(0);
    }

}
