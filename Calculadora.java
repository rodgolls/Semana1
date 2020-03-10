import javax.swing.*;
public class Calculadora
{
   public static void main (String [] args)
   {
      int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
      int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
      int res = a + b;
      String dois = "A soma do primeiro com o segundo é:" + " " + res + ".";
      JOptionPane.showMessageDialog(null,dois);
      System.exit(0);
   }
}