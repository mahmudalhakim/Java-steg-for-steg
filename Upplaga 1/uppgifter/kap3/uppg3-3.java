 // Filen Gallon.java

 import javax.swing.*;

 public class Gallon {
   public static void main (String[] arg) {
     String indata = JOptionPane.showInputDialog("Miles per gallon?");
     double milesPerGallon = Double.parseDouble(indata);
     double literPerMil = 3.785/milesPerGallon/1.609*10;
     JOptionPane.showMessageDialog(null, literPerMil + " l/mil");
   }
  }

