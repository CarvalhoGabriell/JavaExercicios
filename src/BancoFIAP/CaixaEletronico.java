package BancoFIAP;

import javax.swing.*;

public class CaixaEletronico {

    private Conta contaAtiva;

    public float sacarDaConta(float valor) {
        if (valor > contaAtiva.getSaldo()) {
            System.out.println("Saldo inválido em conta");
        } else {
            float saldoAtual = contaAtiva.getSaldo() - valor;
            contaAtiva.setSaldo(saldoAtual);
        }
        return contaAtiva.getSaldo();
    }

    public float depositarNaConta(float valor) {
        if (valor > 0) {
            contaAtiva.setSaldo(valor + contaAtiva.getSaldo());
        } else {
            System.out.println("Não é possivel depositar valores negativos");
        }
        return contaAtiva.getSaldo();
    }

    public void setContaAtiva(Conta contaAtiva) {
        this.contaAtiva = contaAtiva;
    }

    public void imprimirDadosConta() {
        System.out.println("---------------------------------------------------------------\n");
        System.out.println("Banco FIAP: \n");
        System.out.println("Nome do titular: " + contaAtiva.getTitular().getNome());
        System.out.println("Número da conta: " + contaAtiva.getNumeroConta());
        System.out.println("Saldo atual: " + contaAtiva.getSaldo());
        System.out.println("---------------------------------------------------------------\n");
    }

    public Conta getContaAtiva() {
        return contaAtiva;
    }

}
