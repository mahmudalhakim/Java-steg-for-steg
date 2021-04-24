// Filen Kommun.java

import javax.swing.*;

public class Kommun {
  public static void main (String[] arg) {
    String s = JOptionPane.showInputDialog("Vilket år?");
    int år = Integer.parseInt(s);
    int antal = 26000;
    for (int i=2013; i<=år; i++)
      antal = antal + (int) (300 - 325 + antal*(0.7-0.6)/100+0.5);    
    JOptionPane.showMessageDialog(null, "Beräknad befolkning :" + antal);
  }
}
