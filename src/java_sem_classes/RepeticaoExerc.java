package java_sem_classes;

public class RepeticaoExerc {
    public static void main(String[] args) {

//        for(int i =0 ; i <= 100; i++) {
//            System.out.println("numero: " + i);
//        }

//        int num = 0;
//        while (num <= 100) {
//            System.out.println("Numero: " + num);
//            num = num + 1;
//        }

//        int cont = 0;
//        do {
//            System.out.println("Numeros: " + cont);
//            cont = cont + 1;
//        } while (cont <= 100);

        for (int i = 0; i < 10; i++) {

            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println("LINHA:");
        }
    }
}
