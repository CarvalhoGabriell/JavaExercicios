package ConersaoDados.Exerc06;

import javax.swing.*;

public class Livraria {

    public static void main(String[] args) {
        // LIVRO 1
        Livro livro = new Livro();

        livro.setTituloOriginal("PLAYER NUMBER ONE");
        livro.setTituloPortugues("JOGADOR NUMERO UM");
        livro.setQtdPaginas(420);
        livro.setAnoPublic(2016);
        livro.setAutor("ERNEST CLINE");
        livro.setEdicao(1);
        livro.setIsbn("NUM1547");


        // LIVRO 2
        Livro livro2 = new Livro();

        livro2.setTituloPortugues("GUERRA INFINITA");
        livro2.setTituloOriginal("INFINITY WAR");
        livro2.setQtdPaginas(500);
        livro2.setAnoPublic(1999);
        livro2.setAutor("STAN LEE");
        livro2.setEdicao(52);
        livro2.setIsbn("AVEN9999");

        JOptionPane.showMessageDialog(null,livro.exibirTitulos()+"\n");
        JOptionPane.showMessageDialog(null, "Esses são os títulos dos filmes");
    }
}
