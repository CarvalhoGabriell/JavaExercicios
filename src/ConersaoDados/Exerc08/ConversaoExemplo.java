package ConersaoDados.Exerc08;

import javax.swing.*;
import java.util.Scanner;

public class ConversaoExemplo {
    public static void main(String[] args) {

//        Scanner scan = new Scanner(System.in);

       String byteString = JOptionPane.showInputDialog("Digite um byte: ");
       byte numByte = Byte.parseByte(byteString);

       String shortString = JOptionPane.showInputDialog("Digite um short: ");
       short numShort = Short.parseShort(shortString);

       String longString = JOptionPane.showInputDialog("Digite um long: ");
       long numLong = Long.parseLong(longString);

       String intString = JOptionPane.showInputDialog("Digite um int: ");
       int numInteger = Integer.parseInt(intString);

       String floatString = JOptionPane.showInputDialog("Digite um float: ");
       float numFloat = Float.parseFloat(floatString);

       String doubleString = JOptionPane.showInputDialog("Digite um double: ");
       double numDouble = Double.parseDouble(doubleString);

       String booleanString = JOptionPane.showInputDialog("Digite um boolean: ");
       boolean numBoolean = Boolean.parseBoolean(booleanString);


       JOptionPane.showMessageDialog(null,
               "Byte: "+numByte+ " - Short: "+numShort+" - Long: "+numLong+
                       " - Integer: "+numInteger+" - Float: "+numFloat+
                       " - Double: "+numDouble+" - Boolean: "+numBoolean
               );
    }
}
