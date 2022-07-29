import Cliente.PessoaFisica;

public class Aplicacao {
    public static void main(String[] args) throws Exception {
        PessoaFisica pessoa1 = new PessoaFisica("Victor", "987654321");
        PessoaFisica pessoa2 = new PessoaFisica("Luiz", "123456789");

        //Criar conta investimento
        pessoa1.criarContaInvestimento(pessoa1.getNome(), pessoa1.getCpf());
        pessoa2.criarContaInvestimento(pessoa1.getNome(), pessoa1.getCpf());

        //Criar conta poupanca
        pessoa1.criarContaPoupanca(pessoa1.getNome(),pessoa1.getCpf());
        //
        pessoa2.criarContaPoupanca("Luiz","123456789");


        System.out.println(pessoa1.toString());
        System.out.println(pessoa2.toString());
        System.out.println();

        System.out.printf("Saldo do cliente %s é de R$%.2f.\n",pessoa1.getNome(), pessoa1.getContaCorrente().getSaldo());
        System.out.printf("Saldo do cliente %s é de R$%.2f.\n",pessoa2.getNome(), pessoa2.getContaCorrente().getSaldo());
        System.out.println();

        pessoa1.getContaCorrente().deposito(500, pessoa1.getTaxaInvestimento());
        System.out.printf("Saldo do cliente %s é de R$%.2f.\n",pessoa1.getNome(), pessoa1.getContaCorrente().getSaldo());
        System.out.printf("Saldo do cliente %s, na conta poupança, é de R$%.2f.\n",pessoa1.getNome(),pessoa1.getContaPoupanca().getSaldoPoupanca());
        System.out.printf("Saldo do cliente %s, na conta investimento, é de R$%.2f.\n",pessoa1.getNome(),pessoa1.getContaInvestimento().getSaldo());

        System.out.println();

        pessoa1.getContaCorrente().saque(600, pessoa1.getTaxa());
        pessoa1.getContaCorrente().saque(217, pessoa1.getTaxa());
        System.out.printf("%s sacou R$%.2f e possui R$%.2f de saldo em conta",pessoa1.getNome(),217.00,pessoa1.getContaCorrente().getSaldo());
        System.out.println();

        pessoa1.getContaCorrente().transferencia(pessoa2, 150, pessoa1.getTaxa());
        System.out.printf("Saldo do cliente %s é de R$%.2f.\n",pessoa1.getNome(), pessoa1.getContaCorrente().getSaldo());
        System.out.printf("Saldo do cliente %s é de R$%.2f.\n",pessoa2.getNome(), pessoa2.getContaCorrente().getSaldo());
        System.out.println();



        //deposito na conta investimento e seu rendimento
        pessoa1.getContaInvestimento().deposito(1000, pessoa1.getTaxaInvestimento());
        System.out.printf("Saldo do cliente %s, na conta investimento, é de R$%.2f.\n",pessoa1.getNome(),pessoa1.getContaInvestimento().getSaldo());



    }
}