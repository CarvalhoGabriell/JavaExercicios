package ConersaoDados.Exerc07;

import javax.swing.*;

public class TrocandoSilaba {

    public static void main(String[] args) {

        String palavra = JOptionPane.showInputDialog("Digite uma palavra terminada na sílaba \"AR\": ");

        if (palavra.endsWith("ar")) {
            String palavraConcate = palavra.substring(0, palavra.length() - 2).concat("ou");
            JOptionPane.showMessageDialog(null, "A palavra digitada ficou assim: "+palavraConcate);
        } else {
         JOptionPane.showMessageDialog(null,"Palavra Inválida, por favor digite uma palavra terminada me 'AR'.");
        }
    }
}
