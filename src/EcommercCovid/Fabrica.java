package EcommercCovid;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {
    private int qntMateriaPrima = 1000;
    private int funcionarioTrabalhando = 10;


    public List<Mascara> gerarMascaras(int quantidade) {

        List<Mascara> listaMascaras = new ArrayList<>();

        if(funcionarioTrabalhando > 0) {
            System.out.println("Fábrica Ativa!");
        }else {
            System.out.println("Não há funcionários trabalhando. A fabrica está parada");
        }

        if(qntMateriaPrima <= 1000) {
            qntMateriaPrima = qntMateriaPrima - quantidade;
            System.out.println("A quantidade de matéria prima agora é de "+ qntMateriaPrima+ " unidade(s)");
        } else {
            System.out.println("Nã há matéria prima suficiente");
        }

            for(int i = 0; i < quantidade; i++) {
                Mascara mascara = new Mascara();
                mascara.setTipoTecido("Algodão");
                mascara.setTamanhoMascara("Adulto");

                listaMascaras.add(mascara);
                mascara.exibirInstrucoes();
            }
            return listaMascaras;
    }



    public int adicionarFuncionario(int numFuncionario) {
        int total = funcionarioTrabalhando + numFuncionario;
        System.out.println("No momento existem "+total+ " trabalhando.");
        return total;
    }

    public int demitirFuncionario(int numFuncionario) {
        if (funcionarioTrabalhando > 0) {
            int total = funcionarioTrabalhando - numFuncionario;
            System.out.println("Funcionário demitido com sucesso...");
            System.out.println("Agora são "+total+" funcionários tabalhando.");
            return total;
        }else {
            System.out.println("Funcionarios OK!");
        }
       return numFuncionario;
    }


    public int getQntMateriaPrima() {

        return qntMateriaPrima;
    }

    public void setQntMateriaPrima(int qntMateriaPrima) {

        this.qntMateriaPrima = qntMateriaPrima;
    }

    public int getFuncionarioTrabalhando() {

        return funcionarioTrabalhando;
    }

    public void setFuncionarioTrabalhando(int funcionarioTrabalhando) {

        this.funcionarioTrabalhando = funcionarioTrabalhando;
    }
}
