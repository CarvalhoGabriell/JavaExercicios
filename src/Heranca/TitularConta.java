package Heranca;

public class TitularConta {

    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("Olá "+nome+" Seja bem vindo!");
    }

    public String getCpf() {

        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
        System.out.println("Numero de CPF válido!!");
    }
}
