package java_sem_classes;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo a calculadora, informe os numeros para realizar as operações.");

        System.out.println("Digite um numero: ");
        int numero1 = scanner.nextInt();

        System.out.println("Escolha uma das opções de operações: (+,*,-,/)");
        String opcao = scanner.next();

        System.out.println("Digite outro numero: ");
        int numero2 = scanner.nextInt();

        int result = 0;
        if(opcao.equals("+")){
            result = numero1 + numero2;
        }

        if(opcao.equals("-")){
            result = numero1 - numero2;
        }

        if(opcao.equals("*")){
            result = numero1 * numero2;
        }

        if(opcao.equals("/")){
            if(numero2 == 0){
                System.out.println("Operação não permitida");
            }else {
                result = numero1 / numero2;
            }
        }

        System.out.println("O resultado é  " + result);
    }
}
