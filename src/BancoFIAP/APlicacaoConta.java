package BancoFIAP;

import java.time.LocalDate;
import java.util.Scanner;

public class APlicacaoConta {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem Vindo ao Banco FIAP informe as opções abaixo");

        System.out.println("Informe seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Qual seu dia de nascimento? ");
        int dia = scan.nextInt();
        System.out.println("Qual seu mês de nascimento? ");
        int mes = scan.nextInt();
        System.out.println("Qual seu ano de nascimento? ");
        int ano = scan.nextInt();

        LocalDate dataNascimento = LocalDate.of(dia, mes, ano);


        CaixaEletronico caixa = new CaixaEletronico();
        caixa.sacarDaConta(1200);
        caixa.depositarNaConta(250.50f);
        caixa.imprimirDadosConta();
    }
}
