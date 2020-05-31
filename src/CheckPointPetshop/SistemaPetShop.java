package CheckPointPetshop;
import java.util.Scanner;

public class SistemaPetShop {

    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);
        Animal cliente = new Animal();
        PetShop petShop = new PetShop();

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("--------------------- MENU DE OPÇÕES: ----------------------");
            System.out.println("[1] -> Cadastrar Animal (OBRIGATÓRIO)");
            System.out.println("[2] -> Examinar Animal.");
            System.out.println("[3] -> Dar Banho no Animal.");
            System.out.println("[4] -> Vacinar Animal.");
            System.out.println("[5] -> Sair do PetShop\n");
            System.out.println("Escolha uma das opções para melhor atendermos: ");
            opcao = menu.nextInt();



            switch (opcao) {
                case 1:
                    System.out.println("Vamos cadastrar seu pet Agora. Só vai levar alguns segundos.");
                    System.out.println("Qual o nome dele(a)? ");
                    String nomes = menu.next();
                    cliente.nomeDoAnimal(nomes);
                    System.out.println("Qual o tipo? \t(EX: \"GATO\", \"CACHORRO\", \"AVE\".)");
                    String tipoEscolha = menu.next();
                    cliente.tipoDoAnimal(tipoEscolha);
                    System.out.println("Qual seria o porte? ");
                    String porteEscolha = menu.next();
                    cliente.porteDoAnimal(porteEscolha);
                    break;

                case 2:
                    System.out.println("Qual animal você deseja examinar: ");
                    String animal = menu.next();
                    petShop.examinarAnimais();
                    System.out.println("O exame do(a) "+animal+ " " +cliente.getNome()+" foi realizado com sucesso. \n");
                    break;
                case 3:
                    System.out.println("Qual o porte do animal que você deseja dar banho: ");
                    String porte = menu.next();
                    petShop.banhoNoAnimal(porte);
                    System.out.println("Agora o(a) "+cliente.getNome()+ " está cheroso(a)!!!");
                    break;
                case 4:
                    System.out.println("Qual animal você deseja vacinar.");
                    String tipo = menu.next();
                    petShop.vacinarAnimal(tipo);
                    System.out.println("Pronto agora o(a)"+cliente.getNome()+" está vacinado(a).");
                    break;
                case 5:
                    petShop.exibirTotalApagar();
                    System.out.println("Tchau, Tchau "+cliente.getNome()+" Volte sempre");
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
