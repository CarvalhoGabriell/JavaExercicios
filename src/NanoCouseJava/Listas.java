package NanoCouseJava;

import java.util.ArrayList;

public class Listas {

    public static void main(String[] args) {
        ArrayList lista = new ArrayList();

        lista.add("Gabriel");
        lista.add("Vlaber");
        lista.add(1999);

        lista.set(0, "Joanderson");

        lista.add("Java");
        lista.remove(0);

        System.out.println(lista);
        System.out.println(lista.get(2));

        for (int i = 0; i< lista.size(); i++) {
            System.out.println("O conteudo dessa lista é : "+lista.get(i));
        }

    }
}
