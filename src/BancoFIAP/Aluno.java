package BancoFIAP;

import java.time.LocalDate;

public class Aluno {

    private String nome;
    private String cpf;
    private LocalDate dataNascimneto;

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

    public LocalDate getDataNascimneto() {
        return dataNascimneto;
    }

    public void setDataNascimneto(LocalDate dataNascimneto) {
        this.dataNascimneto = dataNascimneto;
    }
}
