package java_sem_classes;

import java.util.Scanner;

public class Comparacao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // INFORMAÇÕES DA PESSOA 1

        System.out.println("Digite seu nome aqui: ");
        String nome1 = scanner.next();

        System.out.println("Informe sua altura:");
        float alt1 = scanner.nextFloat();

        System.out.println("Agora informe sua peso: ");
        float peso1 = scanner.nextFloat();

        // INFORMAÇÃO DA PESSOA 2

        System.out.println("Digite o outro nome aqui: ");
        String nome2 = scanner.next();

        System.out.println("Informe a outra altura:");
        float alt2 = scanner.nextFloat();

        System.out.println("Agora informe o outro peso: ");
        float peso2 = scanner.nextFloat();

        if (peso1 > peso2) {
            System.out.println("O " + nome1 + " é o mais pesado");
        } else if (peso1 < peso2) {
            System.out.println("O " + nome2 + " é o mais pesado");
        } else {
            System.out.println("O " + nome1 + " e "+ nome2 + " tem o mesmo peso");
        }

        if (alt1 > alt2) {
            System.out.println("O " + nome1 + " é o mais alto.");
        } else if (alt1 < alt2) {
            System.out.println("O " + nome2 + " é o mais alto");
        } else{
            System.out.println("O " + nome1 + nome2 + " tem a mesma altura");
        }

    }
}
