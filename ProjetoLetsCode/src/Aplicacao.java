import Cliente.PessoaFisica;
import Cliente.PessoaJuridica;

public class Aplicacao {
    public static void main(String[] args) throws Exception {
        PessoaFisica pessoa1 = new PessoaFisica("Victor", "987654321");
        PessoaFisica pessoa2 = new PessoaFisica("Luiz", "123456789");
        PessoaJuridica pessoa3 = new PessoaJuridica("Hugo", "13579111315");

        // Criar conta investimento
        pessoa1.criarContaInvestimento(pessoa1.getNome(), pessoa1.getCpf());
        pessoa2.criarContaInvestimento(pessoa1.getNome(), pessoa1.getCpf());
        pessoa3.criarContaInvestimento(pessoa1.getNome(), pessoa1.getCpf());

        // Criar conta poupanca
        pessoa1.criarContaPoupanca(pessoa1.getNome(), pessoa1.getCpf());
        //
        pessoa2.criarContaPoupanca("Luiz", "123456789");

        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println(pessoa3.toString());
        System.out.println();

        System.out.printf("Saldo do cliente %s é de R$%.2f.\n", pessoa1.getNome(),
                pessoa1.getContaCorrente().getSaldo());
        System.out.printf("Saldo do cliente %s é de R$%.2f.\n", pessoa2.getNome(),
                pessoa2.getContaCorrente().getSaldo());
        System.out.printf("Saldo do cliente %s é de R$%.2f.\n", pessoa3.getNome(),
                pessoa3.getContaCorrente().getSaldo());
        System.out.println();

        pessoa1.getContaCorrente().deposito(500, pessoa1.getTaxaInvestimento());
        System.out.printf("Saldo do cliente %s é de R$%.2f.\n", pessoa1.getNome(),
                pessoa1.getContaCorrente().getSaldo());
        System.out.printf("Saldo do cliente %s, na conta poupança, é de R$%.2f.\n", pessoa1.getNome(),
                pessoa1.getContaPoupanca().getSaldoPoupanca());
        System.out.printf("Saldo do cliente %s, na conta investimento, é de R$%.2f.\n", pessoa1.getNome(),
                pessoa1.getContaInvestimento().getSaldo());
        System.out.println();

        pessoa3.getContaCorrente().deposito(500, 0);
        System.out.printf("Saldo do cliente %s é de R$%.2f.\n", pessoa3.getNome(),
        pessoa3.getContaCorrente().getSaldo());
        System.out.println();

        // tentativa de sacar mais que possui na conta;
        pessoa1.getContaCorrente().saque(600, pessoa1.getTaxa());
        // saque conta pessoa fisica
        pessoa1.getContaCorrente().saque(217, pessoa1.getTaxa());
        System.out.printf("%s sacou R$%.2f e possui R$%.2f de saldo em conta", pessoa1.getNome(), 217.00,
                pessoa1.getContaCorrente().getSaldo());
        System.out.println();
        // saque pessoa juridica
        pessoa3.getContaCorrente().saque(80, pessoa3.getTaxa());
        System.out.printf("%s sacou R$%.2f e possui R$%.2f de saldo em conta", pessoa3.getNome(), 80.00,
                pessoa3.getContaCorrente().getSaldo());
        System.out.println();

        // transferencia pessoa fisica
        pessoa1.getContaCorrente().transferencia(pessoa2, 150, pessoa1.getTaxa());

        System.out.printf("Saldo do cliente %s é de R$%.2f.\n", pessoa1.getNome(),
                pessoa1.getContaCorrente().getSaldo());
        System.out.printf("Saldo do cliente %s é de R$%.2f.\n", pessoa2.getNome(),
                pessoa2.getContaCorrente().getSaldo());
        System.out.printf("Saldo do cliente %s é de R$%.2f.\n", pessoa3.getNome(),
                pessoa3.getContaCorrente().getSaldo());
        System.out.println();

        // transferencia pessoa juridica
        pessoa3.getContaCorrente().transferencia(pessoa2, 55, pessoa3.getTaxa());

        System.out.printf("Saldo do cliente %s é de R$%.2f.\n", pessoa2.getNome(),
                pessoa2.getContaCorrente().getSaldo());
        System.out.printf("Saldo do cliente %s é de R$%.2f.\n", pessoa3.getNome(),
                pessoa3.getContaCorrente().getSaldo());
        System.out.println();

        // deposito na conta investimento e seu rendimento

        System.out.println(pessoa1.getNome() + ", sua conta investimento tem a seguinte rentabilidade:");
        pessoa1.getContaInvestimento().deposito(1000, pessoa1.getTaxaInvestimento());
        System.out.printf("Saldo do cliente %s, na conta investimento, é de R$%.2f.\n", pessoa1.getNome(),
                pessoa1.getContaInvestimento().getSaldo());
        System.out.println();
        System.out.println(pessoa3.getNome() + ", sua conta investimento tem a seguinte rentabilidade:");
        pessoa3.getContaInvestimento().deposito(1000, pessoa3.getTaxaInvestimento());
        System.out.printf("Saldo do cliente %s, na conta investimento, é de R$%.2f.\n", pessoa3.getNome(),
                pessoa3.getContaInvestimento().getSaldo());

    }
}