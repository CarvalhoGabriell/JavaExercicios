package SobreCargas;

import javax.swing.*;

public class Funcionario {
    private String nome;
    private long matricula;
    private double salario;
    private Profissao profissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public Funcionario () {}

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }


    public Funcionario(long matricula) {
        this.matricula = matricula;
    }

    public Funcionario(long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Funcionario(long matricula, String nome, Profissao profissao) {
        this.matricula = matricula;
        this.nome = nome;
        this.profissao = profissao;
    }

    public void exibirDadosFuncionario() {
        JOptionPane.showMessageDialog(null, "Nome: ".concat(nome)
                                                                    .concat("\nMatricula: ").concat(String.valueOf(matricula))
                                                                    .concat("\nProfissao: ").concat(getProfissao().getNome())
                                                                    .concat("\nSalario: ").concat(String.valueOf(getSalario())));
    }
}
