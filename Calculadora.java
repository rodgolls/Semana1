import javax.swing.*;
public class Calculadora
{
   public static void main (String [] args)
   {
      int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
      int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
      int res = a + b;
      int res2 = a - b;
      String dois = "A soma do primeiro com o segundo �:" + " " + res + ".";
      String tres = "A subtra��o do primeiro com o segundo � :" + " " + res2 + ".";
      JOptionPane.showMessageDialog(null,dois);
      JOptionPane.showMessageDialog(null,tres);
      System.exit(0);
   }
}