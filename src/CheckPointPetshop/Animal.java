package CheckPointPetshop;

public class Animal {

    private String nome;
    private String porteAnimal;
    private String tipoAnimal;


    public String nomeDoAnimal(String nome) {

        return this.nome;
    }

    public String tipoDoAnimal(String tipoAnimal) {


        return this.tipoAnimal;
    }


    public String porteDoAnimal(String porteAnimal) {


        return this.porteAnimal;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPorteAnimal() {
        return porteAnimal;
    }

    public void setPorteAnimal(String porteAnimal) {
        this.porteAnimal = porteAnimal;
    }

    public String getTipoDoanimal() {
        return tipoAnimal;
    }

    public void setTipoDoanimal(String tipoDoanimal) {
        this.tipoAnimal = tipoDoanimal;
    }
}
