package SobreCargas;

import javax.swing.*;

public class Carro {

    private String placa;
    private String marca;
    private String modelo;
    private int ano;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano > 1910 && ano <= 2017 ) {
            JOptionPane.showMessageDialog(null, "Carro Ilegível, e atual");
        } else {
            JOptionPane.showMessageDialog(null, "O carro ainda não foi lançado ainda");
        }
        this.ano = ano;
    }

    public Carro() {}

    public Carro(String placa, String marca, String modelo, int ano) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

}
