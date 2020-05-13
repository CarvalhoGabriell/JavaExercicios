package EcommercCovid;

public class EcommerceLoja {
    public static void main(String[] args) {
        Fabrica fabrica = new Fabrica();
        LojaVirtual loja = new LojaVirtual();
        Mascara mascara = new Mascara();

        int numeroDeFuncionario = fabrica.adicionarFuncionario(25);
        fabrica.gerarMascaras(100);

        loja.solicitarMascarasFabrica(fabrica);
        loja.statusEstoqueLoja(fabrica);

    }
}
