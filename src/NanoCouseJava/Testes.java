package NanoCouseJava;

public class Testes {

    public static void main(String[] args) {

        Carro[] carros = new Carro[5];

        Carro carro = new Carro();
        carro.setModelo("Civic");
        carro.setAnoFabricacao(1999);
        carro.setCor("Azul");

        carros[0] = carro;

        Carro carro1 = new Carro();
        carro1.setModelo("Nissan GTX");
        carro1.setCor("Azul marinho");
        carro1.setAnoFabricacao(2014);

        carros[1] = carro1;

        System.out.println("A cor do carro "+carros[1].getModelo()+ " é "+carros[1].getCor());

    }
}
