import java.util.Scanner;

public class NanoCourses {

    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);
//        float[] notas = new float[10];
//
//        // loop para pegar todas as notas do aluno
//        for (int i = 0; i < 10; i++) {
//
//            System.out.println("Digite as notas do aluno aqui: ");
//            notas[i] = scan.nextFloat();
//        }
//        scan.close();
//
//        // agora o looping é para fazer a média do aluno, conforma a quantidade de notas
//
//        float totalNotas = 0;
//        for (int i = 0; i < notas.length; i++ ) {
//            totalNotas = totalNotas + notas[i];
//        }
//        float media = totalNotas/notas.length;
//        System.out.println("A média final desse auno é = " +media);

        String nome = "Gabriel Carvalho";
        String facul = "FIAP";

        String ocupacao = nome;
            ocupacao += " estuda na ";
            ocupacao += facul;
        System.out.println(ocupacao);

        int tamanhoNome = nome.length(); // o metodo lentgh retorna sempre um int.
        System.out.println(tamanhoNome + " caracteres" );

        String note = "Lenovo advantage S145";

        char caracter = note.charAt(5); // passar a posição dentro do array que voce quer saber.
        System.out.println("O caracter na posião 5 é a letra "+caracter);

        String name = "Ana Banana Ratazana";
        int posicao = name.indexOf("a"); // sempre lembrar que String tambem é um array e começa na posição "0".
        System.out.println("A posição da primeira ocorrencia da letra \"a\" é "+posicao);

        String tipo = "A linguagem Ruby é a mais curiosa dentro das outras.";
        int posicao2 = tipo.indexOf("Ruby"); // se passarmos uma palavra completa ele irá pegar o inicio da sua ocorrencia.
        System.out.println(posicao2);

        String nome2 = "Gabriel Vagabundo";
        String nomeNew = nome2.substring(2,11);
        System.out.println(nomeNew);  // o metodo substring pega o valor do index do inicio que vc quer que comece , até a posição final


    }
}
