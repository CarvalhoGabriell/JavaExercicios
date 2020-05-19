package Heranca;

import BancoFIAP.Conta;

public class CaixaEletronico extends ContaBancaria{

    public static void main(String[] args) {
        TitularConta titular = new TitularConta();
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();


        contaCorrente.setAgencia(77);
        contaCorrente.setNumConta("4545454");
        titular.setNome("Gabriel Carvalho");
        titular.setCpf("4887854128");

        contaCorrente.setSaldo(3500);
        contaCorrente.depositarQuantia(3000);
        contaCorrente.sacarQuantia(1500);

        contaPoupanca.setTaxaJuros(2.52);
        contaPoupanca.atualizarSaldoComJuros();
    }
}
