package CheckPointPetshop;

import javax.swing.*;

public class SistemaPetShop {

    public static void main(String[] args) {

        Animal animal = new Animal();
        PetShop petShop = new PetShop();


        // 1° animal
        animal.nomeDoAnimal("Osmar");
        animal.porteDoAnimal("pequeno");
        animal.tipoDoAnimal("gato");
        


        do {
            System.out.println("---------------- Bem vindo ao nosso PetShop ----------------------");
            System.out.println("--------------------- MENU DE OPÇÕES: ----------------------");
            System.out.println("-1 -> Examinar Animal.");
            System.out.println("-2 -> Dar Banho no Animal.");
            System.out.println("-3 -> Vacinar Animal.");
            System.out.println("-4 -> Sair do PetShop");
            String opcao = JOptionPane.showInputDialog("Escolha uma das opções para melhor atendermos!");

            switch (opcao) {
                case "1":
                    System.out.println("O valor do exame é de R$ 70,00 reais");

                 break;

            }

        }


        while (true);
    }
}
