package CheckPointPetshop;

import javax.swing.*;

public class SistemaPetShop {

    public static void main(String[] args) {

        do {
            System.out.println("---------------- Bem vindo ao nosso PetShop ----------------------");
            System.out.println("--------------------- MENU DE OPÇÕES: ----------------------");
            System.out.println("-1 -> Examinar Animal.");
            System.out.println("-2 -> Dar Banho no Animal.");
            System.out.println("-3 -> Vacinar Animal.");
            System.out.println("-4 -> Sair do PetShop");
            JOptionPane.showInputDialog("Escolha uma das opções para melhor atendermos!");
        }


        while (true);
    }
}
