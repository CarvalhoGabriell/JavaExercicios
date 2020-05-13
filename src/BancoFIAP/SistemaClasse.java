package BancoFIAP;

public class SistemaClasse {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Gabriel");
        pessoa1.setAltura(1.70f);
        pessoa1.setIdade(21);
        pessoa1.infoPessoa();


        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Kleibson");
        pessoa2.setIdade(45);
        pessoa2.setAltura(1.85f);
        pessoa2.infoPessoa();

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Clauber");
        pessoa3.setIdade(25);
        pessoa3.setAltura(1.65f);
        pessoa3.infoPessoa();
    }

}