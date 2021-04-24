// Filen DemoAvFel2.java

import javax.swing.*;
public class DemoAvFel2 {
  public static void main (String[] arg) {
    String t = JOptionPane.showInputDialog("Ett tal?");
    int i;
    for (i=0; i<t.length(); i++)
      if (t.charAt(i) < '0' ||  t.charAt(i) > '9')
        break;
    if (i < t.length())
      JOptionPane.showMessageDialog(null,"Inget tal"); 
    else       
      JOptionPane.showMessageDialog(null,"Talet är OK"); 
  }
}
