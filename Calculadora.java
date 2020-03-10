import javax.swing.*;
public class Calculadora
{
   public static void main (String [] args)
   {
      int a = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
      int b = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
      int res = a + b;
      int res2 = a - b;
      int res3 = a * b;
      int res4 = a / b;
      String dois = "A soma do primeiro com o segundo é:" + " " + res + ".";
      String tres = "A subtração do primeiro com o segundo é :" + " " + res2 + ".";
      String quatro = "A multiplicação do primeiro com o segundo é:" + " " + res3 + ".";
      String cinco =  "A divisão do primeiro com o segundo é:" + " " + res4 + ".";
      JOptionPane.showMessageDialog(null,dois);
      JOptionPane.showMessageDialog(null,tres);
      JOptionPane.showMessageDialog(null,quatro);
      JOptionPane.showMessageDialog(null,cinco);
      System.exit(0);
   }
}