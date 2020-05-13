package java_sem_classes;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class EstruturaRepeticao {
    public static void main(String[] args) {
        // FOR -> Usar quando voce precisar passar varias vezez por uma variavel

        for (int i = 0; i < 10; i++) {
            System.out.println("Numeros " + i);
        }

        List<String> listadePalavras = new ArrayList<>();
        // Construção do de uma lista de array
        listadePalavras.add("Homem Aranha");
        listadePalavras.add("Tocha Humana");
        listadePalavras.add("Homem de ferro");
        listadePalavras.add("Doutor Estranho");
        listadePalavras.add("Gamora");

        // FOR EACH -> Usado quando se trata de uma Collection
        for (String palavra : listadePalavras) {
            System.out.println("Nome do herói: " + palavra);
        }
        // WHILE -> usar quando tiver uma opçao de variavel mais flexivel .
        int num = 0;
        while (num < 20) {
            System.out.println(num);
            num = num + 2;
            }

        // DO WHILE -> usar quando voce precisa que execute pelo menos uma vez.
        int numero = 1;
        do {
            System.out.println("numero " + numero);
            numero = numero + 5;
        } while (numero < 50);


        }
}

