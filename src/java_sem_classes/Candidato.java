package java_sem_classes;

import java.util.Scanner;

public class Candidato {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // CADASTRAR PESSOA 1

        System.out.println("Por favor, Digite seu nome aqui: ");
        String nome1 = scanner.next();

        System.out.println("Informe sua idade também: ");
        int idade = scanner.nextInt();

        if(idade < 16) {
            System.out.println("Você não pode votar ainda.");
        } else if (idade >= 18 && idade <= 65) {
            System.out.println("Seu voto é obrigatório");
            System.out.println("Digite aqui sua escolha de voto:");
            int voto = scanner.nextInt();
            System.out.println("Obrigado pelo seu voto!");
        }else {
            System.out.println("Seu voto é opcional agora!");
            System.out.println(nome1 + " " + "você deseja votar? " + "(sim ou nao)");
            String message = scanner.next();

            if(message.equals("sim")){
                System.out.println("Digite aqui sua escolha de voto:");
                int voto2 = scanner.nextInt();
                System.out.println("Obrigado pelo seu voto!");
            } else {
                System.out.println("Obrigado pela sua atenção!!");
            }
        }
    }
}
