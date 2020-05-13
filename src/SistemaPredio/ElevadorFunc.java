package SistemaPredio;

public class ElevadorFunc {

    public static void main(String[] args) {
        Elevador elevador = new Elevador();

        elevador.inicializar(20,10);
        elevador.entrarElevador();
        elevador.entrarElevador();
        elevador.entrarElevador();
        elevador.entrarElevador();
        elevador.subir();
        elevador.subir();
        elevador.exibirPessoasAbordo();
        elevador.exbibirEstadoAtual();
        elevador.entrarElevador();
        elevador.entrarElevador();
        elevador.entrarElevador();
        elevador.entrarElevador();

        elevador.sairElevador();
        elevador.sairElevador();
        elevador.sairElevador();
        elevador.sairElevador();
        elevador.sairElevador();

    }
}
