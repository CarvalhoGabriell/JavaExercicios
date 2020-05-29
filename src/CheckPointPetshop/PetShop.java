package CheckPointPetshop;

public class PetShop {

    private Animal animal;
    private int total;



    public String examinarAnimais(int valorExame) {
        valorExame = 70;
        return "O total do exame em qualquer animal é de R$ 70 reais";
    }


    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }


    public void banhoNoAnimal(Animal porte) {
        if(porte.equals("PEQUENO")) {
            System.out.println("O valor do banho é R$ 40,00 reais");
            this.total = 40;
        }else if (porte.equals("MEDIO")){
            System.out.println("O valor do banho fica em R$ 50,00 reais");
            this.total = 50;
        } else {
            System.out.println("O valor do banho fica R$ 60,00");
            this.total = 60;
        }

    }


    public void vacinarAnimal(Animal animalEscolhido) {

        if(animalEscolhido.equals(animal.tipoDoAnimal("cachorro")) || animalEscolhido.equals(animal.tipoDoAnimal("gato")))
        {
            System.out.println("O valor da vacina para cachorro ou gato é de R$ 100,00 reais");
            this.total = 100;
        } else {

            System.out.println("O valor para os demais animais é de R$ 150,00 reais");
            this.total = 150;
        }
    }


    public int exibirTotalApagar() {
        int valorTotal = this.total + getTotal();
        System.out.println("O total a pagar é de "+valorTotal);
        return valorTotal;
    }

}
