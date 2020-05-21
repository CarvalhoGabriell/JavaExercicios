import java.util.Scanner;

public class NanoCorse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        float[] notas = new float[10];

        // loop para pegar todas as notas do aluno
        for (int i = 0; i < 10; i++) {

            System.out.println("Digite as notas do aluno aqui: ");
            notas[i] = scan.nextFloat();
        }
        scan.close();

        // agora o looping é para fazer a média do aluno, conforma a quantidade de notas

        float totalNotas = 0;
        for (int i = 0; i < notas.length; i++ ) {
            totalNotas = totalNotas + notas[i];
        }
        float media = totalNotas/notas.length;
        System.out.println("A média final desse auno é = " +media);
    }
}
