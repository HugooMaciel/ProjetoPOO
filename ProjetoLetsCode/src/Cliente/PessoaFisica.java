package Cliente;

import Conta.ContaPoupanca;

public class PessoaFisica extends Cliente {

    private ContaPoupanca contaPoupanca;

    public PessoaFisica() {
    }

    public PessoaFisica(String nome, String cpf) {
        super(nome, cpf);
        this.setTaxa(0);
    }

    public ContaPoupanca getContaPoupanca() {
        return contaPoupanca;
    }

    public void setContaPoupanca(ContaPoupanca contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }

    public void criarContaPoupanca(String nome, String cpf) {
        this.contaPoupanca = new ContaPoupanca(nome, cpf);
        this.contaPoupanca.setSaldo(0);
    }

}
