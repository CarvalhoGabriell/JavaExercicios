package Heranca;

import javax.swing.*;

public class ContaPoupanca extends ContaBancaria{

    private double taxaJuros;

    public void atualizarSaldoComJuros() {
         double saldoAtualizado = getSaldo() + (getSaldo()*(taxaJuros/100));
         setSaldo(saldoAtualizado);
        JOptionPane.showMessageDialog(null, "O valor com o juros é de " +saldoAtualizado);
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }
}
