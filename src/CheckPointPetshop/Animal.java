package CheckPointPetshop;

public class Animal {

    private String nome;
    private String porteAnimal;
    private String tipoAnimal;


    public void nomeDoAnimal(String nome) {
        System.out.println("O nome do animal atendido é: "+nome.toUpperCase()+" \n");
        setNome(nome);
    }

    public void tipoDoAnimal(String tipo) {

        System.out.println("O tipo do animal atendido é: "+tipo.toUpperCase()+" \n");
        setTipoDoanimal(tipo);
    }


    public void porteDoAnimal(String porte) {
        System.out.println("O porte do animal é: "+porte.toUpperCase()+" \n");
        setPorteAnimal(porte);
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
