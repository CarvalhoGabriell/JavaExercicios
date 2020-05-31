package CheckPointPetshop;
import java.util.Scanner;

public class SistemaPetShop {

    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);
        PetShop petShop = new PetShop();

        System.out.println("Opa seja bem vindo, qual o nome do seu pet? ");
        String nome = menu.next();

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("--------------------- MENU DE OPÇÕES: ----------------------");
            System.out.println("[1] -> Examinar Animal.");
            System.out.println("[2] -> Dar Banho no Animal.");
            System.out.println("[3] -> Vacinar Animal.");
            System.out.println("[4] -> Sair do PetShop\n");
            System.out.println("Escolha uma das opções para melhor atendermos: ");
            opcao = menu.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Qual animal você deseja examinar: ");
                    String animal = menu.next();
                    petShop.examinarAnimais();
                    System.out.println("O exame do(a) "+animal+ " " +nome+" foi realizado com sucesso. \n");
                    break;
                case 2:
                    System.out.println("Qual o porte do animal que você deseja dar banho: ");
                    String porte = menu.next();
                    petShop.banhoNoAnimal(porte);
                    System.out.println("Agora o(a) "+nome+ " está cheroso(a)!!!");
                    break;
                case 3:
                    System.out.println("Qual animal você deseja vacinar.");
                    String tipo = menu.next();
                    petShop.vacinarAnimal(tipo);
                    System.out.println("Pronto agora o(a)"+nome+" está vacinado(a).");
                    break;
                case 4:
                    petShop.exibirTotalApagar();
                    System.out.println("Tchau, Tchau "+nome+" Volte sempre");
                    System.out.println("Obrigado por nos escolher, volte sempre!!!");
                    menu.close();
                    break;
                default:
                    System.out.println("Opção inválida , por favor digite umas das opções presentes no \"MENU\" .\n");
                    break;

            }
        }


    }

}
