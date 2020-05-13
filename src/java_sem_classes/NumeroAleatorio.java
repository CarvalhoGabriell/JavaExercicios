package java_sem_classes;

import java.util.Random;

public class NumeroAleatorio {

    public static void main(String[] args) {
        Random gerador = new Random();

        int num1 = gerador.nextInt(100);
        int num2 = gerador.nextInt(100);

        int resultSoma = num1 + num2;
        String parOuImpar;

        if(resultSoma % 2 == 0) {
            parOuImpar = "par";
        } else {
            parOuImpar = "ímpar";
        }
        System.out.println("O resultado da soma entre " + num1 + " + " + num2 + " = " + resultSoma + " e esse numero é " + parOuImpar);


        int resultSub = num1 - num2;
        System.out.println("O resultado da subtração entre " + num1 + " - " + num2 + " = " + resultSub);

        int resultMult = num1 * num2;
        System.out.println("O resultado da multiplicação entre " + num1 + " X " + num2 + " = " + resultMult);

        int resultDivsao = num1 % num2;
        System.out.println("O resultado da divisão entre " + num1 + " / " + num2 + " = " + resultDivsao);
    }
}
