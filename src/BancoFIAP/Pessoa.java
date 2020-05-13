package BancoFIAP;

public class Pessoa {

    // ATRIBUTOS
    String nome;
    float altura;
    int idade;

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {

        this.altura = altura;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade) {

        this.idade = idade;
    }

    public void infoPessoa() {
        System.out.println(" O Nome é:.... " + getNome() + "\n");
        System.out.println(" A idade é:.... " + getIdade()+ "\n");
        System.out.println(" A altura é:.... " + getAltura()+ "\n");
    }

}
