package CheckPointPetshop;
import java.util.Scanner;

public class SistemaPetShop {

    public static void main(String[] args) {

        Scanner menu = new Scanner(System.in);
        Animal clients = new Animal();
        PetShop petShop = new PetShop();

        int opcao = 0;
        while (opcao != 5) {
            System.out.println("--------------------- MENU DE OPÇÕES: ----------------------");
            System.out.println("[1] -> Cadastrar Animal (OBRIGATÓRIO)");
            System.out.println("[2] -> Examinar Animal.");
            System.out.println("[3] -> Dar Banho no Animal.");
            System.out.println("[4] -> Vacinar Animal.");
            System.out.println("[5] -> Total a Pagar. E Sair do PetShop.\n");
            System.out.println("Escolha uma das opções para melhor atendermos: ");
            opcao = menu.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Vamos cadastrar seu pet Agora. Só vai levar alguns segundos.");
                    System.out.println("Qual o nome dele(a)? ");
                    String nomes = menu.next();
                    clients.nomeDoAnimal(nomes);
                    System.out.println("Qual o tipo? \t(EX: \"GATO\", \"CACHORRO\", \"AVE\".)");
                    String tipoEscolha = menu.next();
                    clients.tipoDoAnimal(tipoEscolha);
                    System.out.println("Qual seria o porte? ");
                    String porteEscolha = menu.next();
                    clients.porteDoAnimal(porteEscolha);
                    break;

                case 2:
                    petShop.examinarAnimais();
                    System.out.println("O exame do(a) " +clients.getNome()+" foi realizado com sucesso. \n");
                    break;
                case 3:
                    petShop.banhoNoAnimal(clients);
                    System.out.println("Agora o(a) "+clients.getNome()+ " está cheroso(a)!!!");
                    break;
                case 4:
                    petShop.vacinarAnimal(clients);
                    System.out.println("Pronto agora o(a) "+clients.getNome()+" está vacinado(a).");
                    break;
                case 5:
                    petShop.exibirTotalApagar();
                    System.out.println("O animal atendido é: "+"\033[1:31m "+clients.getTipoDoanimal()+"\033[0:0m");
                    System.out.println("O nome do animal atendido: "+"\033[1:34m"+clients.getNome()+"\033[0:0m");
                    System.out.println("O porte dele: "+"\033[1:35m"+clients.getPorteAnimal()+"\033[0:0m");
                    System.out.println("\033[1:34m Obrigado por nos escolher, volte sempre!!!\033[0:0m ");
                    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<< \033[1:34m FIM DO PROGRAMA \033[0:0m >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                    menu.close();
                    break;
                default:
                    System.out.println("\033[2:31mOpção inválida , por favor digite umas das opções presentes no \"MENU DE OPÇÕES\" \033[0:0m.");
                    break;

            }
        }

    }

}
