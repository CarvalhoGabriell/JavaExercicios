package Heranca;

import javax.swing.*;

public class ContaBancaria {

    private double saldo;
    private int agencia;
    private String numConta;
    private TitularConta titular;

    public void sacarQuantia(double valor ) {
        if (saldo > 0) {
            this.saldo = saldo - valor;
            JOptionPane.showMessageDialog(null, "Saque Realizado com sucesso.");
            System.out.println("O saldo atual é de "+ getSaldo());
        }else {
            JOptionPane.showMessageDialog(null, "Saldo indisponivel,não é possivel sacar no momento.");
        }


    }

    public void depositarQuantia(double valor) {
        this.saldo = saldo + valor;
        System.out.println("O saldo atual atualizado é de "+ getSaldo());
    }

    public double getSaldo() {

        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {

        return agencia;
    }

    public void setAgencia(int agencia) {
        JOptionPane.showMessageDialog(null, "O numero da sua conta: "+agencia);
        this.agencia = agencia;
    }

    public String getNumConta() {

        return numConta;
    }

    public void setNumConta(String numConta) {
        JOptionPane.showMessageDialog(null, "O numero da sua conta: "+numConta);
        this.numConta = numConta;
    }

    public TitularConta getTitular() {

        return titular;
    }

    public void setTitular(TitularConta titular) {

        this.titular = titular;
    }
}
