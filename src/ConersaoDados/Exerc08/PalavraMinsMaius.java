package ConersaoDados.Exerc08;

import javax.swing.*;

public class PalavraMinsMaius {

    public static void main(String[] args) {
        String palavraMaiusc = JOptionPane.showInputDialog("Digite qualquer palavra: ");

        JOptionPane.showMessageDialog(null, "Apalavra digitada em maiuscúla fica: "+ palavraMaiusc.toUpperCase());

        String palavraMinus = JOptionPane.showInputDialog("Informe qualquer palavra: ");

        JOptionPane.showMessageDialog(null, "A palavra digitada em minuscúla fica: "+palavraMinus.toLowerCase());

        String camel = JOptionPane.showInputDialog("Informe qualquer palavra: ");

        JOptionPane.showMessageDialog(null, "A palavra digitada é "+camel);
    }
}
