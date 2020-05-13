package ConersaoDados.Exerc08;

import javax.swing.*;

public class ExerciciosExemplos {
    public static void main(String[] args) {

        String trocar = JOptionPane.showInputDialog("Informe qualquer palavra: ");
        JOptionPane.showMessageDialog(null, trocar.replace("a","*")
                .replace("e","*")
                .replace("i","*")
                .replace("o","*")
                .replace("u","*"));
    }
}
