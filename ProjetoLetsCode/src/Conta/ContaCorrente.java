package Conta;

public class ContaCorrente extends Conta {


    public ContaCorrente() {
    }

    public ContaCorrente(String nome, String cpf) {
        super(nome, cpf);
        this.setSaldo(0);
    }

   
}
