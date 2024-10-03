public class Dados {
    public static void main(String[] args) {

        Pessoas pessoa = new Pessoas();
        pessoa.setNome("Lais");
        pessoa.setSobreNome("Veloso");

        System.out.println("Meu nome é " + pessoa.getNome() + " e meu sobrenome é " + pessoa.getSobreNome());

        PessoaFisica fisica = new PessoaFisica();
        fisica.setcpf(123456789d);

        System.out.println("O CPF de pessoa física é: " + fisica.getCpf());

        PessoaJuridica juridico = new PessoaJuridica();
        juridico.setCnpj(0798654321d);

        System.out.println("O CNPJ de pessoa Jurídica é:" + juridico.getCnpj());

    }

}
