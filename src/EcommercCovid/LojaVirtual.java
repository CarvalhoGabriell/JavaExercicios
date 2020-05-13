package EcommercCovid;

import java.util.List;

public class LojaVirtual {

    private int estoque;
    private Fabrica fabrica;


    public boolean venderMascaras(int quantidade) {
        if (estoque >= quantidade) {
            System.out.println("Há mascaras no estoque, venda confirmada");
            System.out.println("Vendendo "+quantidade+" Mascara(s)");
            estoque = estoque - quantidade;
            return true;
        } else{
            System.out.println("Não há mascaras suficientes no estoque. Por favor solicite mais unidades com a Fábrica");
            return false;
        }
    }

    public void solicitarMascarasFabrica(Fabrica fabrica) {
        List<Mascara> listaMascara = fabrica.gerarMascaras(20);
        estoque = estoque + listaMascara.size();
    }

    public int statusEstoqueLoja(Fabrica fabrica) {

        
        return estoque;
    }


    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
