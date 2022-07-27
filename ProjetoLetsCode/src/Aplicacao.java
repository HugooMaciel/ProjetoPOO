import Cliente.PessoaFisica;

public class Aplicacao {
    public static void main(String[] args) throws Exception {
        PessoaFisica pessoa1 = new PessoaFisica("nome", "cpf");
        // PessoaFisica pessoa2 = new PessoaFisica("outro nome", "cpf");

        // System.out.println(pessoa1.getContaCorrente().getSaldo());

        // pessoa1.getContaCorrente().deposito(500);
        // System.out.println(pessoa1.getContaCorrente().getSaldo());

        // pessoa1.getContaCorrente().saque(600);
        // System.out.println(pessoa1.getContaCorrente().getSaldo());

        // pessoa1.getContaCorrente().transferencia(pessoa2, 300);
        // System.out.println(pessoa1.getContaCorrente().getSaldo());
        // System.out.println(pessoa2.getContaCorrente().getSaldo());

        // pessoa1.criarContaPoupanca(pessoa1.getNome(), pessoa1.getCpf());
        // System.out.println(pessoa1.getContaPoupanca().getSaldoPoupanca());

        pessoa1.criarContaInvestimento(pessoa1.getNome(), pessoa1.getCpf());

        // System.out.println(pessoa1.getContaInvestimento().getSaldoInvestimento());

        // pessoa1.getContaInvestimento().investimento(1000);

        pessoa1.getContaInvestimento().deposito(1000, pessoa1.getTaxaInvestimento());
        System.out.println("Saldo: " + pessoa1.getContaInvestimento().getSaldo());

    }
}