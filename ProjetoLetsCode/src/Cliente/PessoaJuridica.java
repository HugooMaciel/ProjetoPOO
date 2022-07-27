package Cliente;

public class PessoaJuridica extends Cliente {

    public PessoaJuridica(String nome, String cpf) {
        super(nome, cpf);
        this.setTaxa(0.005);
        this.setTaxaInvestimento(0.03);
    }
}
