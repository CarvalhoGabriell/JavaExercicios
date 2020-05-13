package java_sem_classes;

import java.util.Scanner;

public class InserirDados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o seu nome? ");

        String nome = scanner.next();

        System.out.println("Seja bem vindo," + nome + " !");
    }


}
