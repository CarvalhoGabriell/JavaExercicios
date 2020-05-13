package SistemaPredio;

public class Elevador {
    private int andarAtual = 0;
    private int totalAndares;
    private int capacidadeElev;
    private int pessoasAbordo = 0;

    public void inicializar(int totalAndares, int capacidadeElev) {
        this.capacidadeElev = capacidadeElev;
        this.totalAndares = totalAndares;

        System.out.println("O total de andares é: " + totalAndares);
        System.out.println("A capacidade total: " + capacidadeElev);
    }

    public void entrarElevador() {
        if (getPessoasAbordo() < capacidadeElev) {
            setPessoasAbordo(pessoasAbordo + 1);
            System.out.println("Uma pessoa acabou de entrar no elevador "+ getPessoasAbordo() + " pessoas no elevador" );
            System.out.println("O total de pessoas permitido é " + getCapacidadeElev());
        } else {
            System.out.println("Capacidade maxima atingida!!! Perigoo");
        }
    }

    public void sairElevador() {
        if (getPessoasAbordo() > 0) {
            setPessoasAbordo(pessoasAbordo - 1);
            System.out.println("Uma pessoa acabou de sair, agora são " + getPessoasAbordo() + " pessoas no elevador");
        } else {
            System.out.println("Não tem ninguem nesse elevador");
        }
    }

    public void subir() {
        if(getAndarAtual() > totalAndares) {
            setAndarAtual(totalAndares + 1);
            System.out.println("Você está subindo para o " + getAndarAtual());
        } else {
            System.out.println("Voce esta subindo");
        }
    }

    public void descer() {
        if(getAndarAtual() < totalAndares) {
            setAndarAtual(totalAndares - 1);
            System.out.println("Você está descendo para o " + getAndarAtual());
        } else {
            System.out.println("Voce esta descendo");
        }
    }

    public void exibirPessoasAbordo() {
        System.out.println("O total de pessoas abordo é: " + pessoasAbordo);
    }

    public void exbibirEstadoAtual() {
        System.out.println("No momento o elevador está no " + andarAtual);
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidadeElev() {
        return capacidadeElev;
    }

    public void setCapacidadeElev(int capacidadeElev) {
        this.capacidadeElev = capacidadeElev;
    }

    public int getPessoasAbordo() {
        return pessoasAbordo;
    }

    public void setPessoasAbordo(int pessoasAbordo) {
        this.pessoasAbordo = pessoasAbordo;
    }
}
