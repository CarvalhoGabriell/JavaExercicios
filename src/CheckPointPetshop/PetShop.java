package CheckPointPetshop;

public class PetShop {

    private Animal animal;
    private double total;
    private double valor;



    public void examinarAnimais() {
        this.valor = 70;
        total = total + valor;
        System.out.println("O total do exame em qualquer animal é de R$ 70 reais.");
    }




    public void banhoNoAnimal(Animal animal) {
        if(animal.getPorteAnimal().equals("pequeno".toLowerCase())) {
            System.out.println("O valor do banho é R$ 40,00 reais");
            this.valor = 40;
            total = total + valor;

        }else if (animal.getPorteAnimal().equals("medio".toLowerCase())){
            System.out.println("O valor do banho fica em R$ 50,00 reais");
            this.valor = 50;
            total = total + valor;

        } else {
            System.out.println("O valor do banho fica R$ 60,00");
            this.valor = 60;
            total = total + valor;
        }
    }


    public void vacinarAnimal(Animal animal) {

        if(animal.getTipoDoanimal().equals(("cachorro")) || animal.getTipoDoanimal().equals(("gato")))
        {
            System.out.println("O valor da vacina para cachorro ou gato é de R$ 100,00 reais");
            this.total = 100;
            total = total + valor;
        } else {
            System.out.println("O valor para os demais animais é de R$ 150,00 reais");
            this.total = 150;
            total = total + valor;
        }
    }


    public void exibirTotalApagar() {
        System.out.println("O total a pagar é de "+"\033[1:33m"+total+"\033[0:0m");
    }


    public double getTotal() {

        return total;
    }

    public void setTotal(int total) {

        this.total = total;
    }


}
