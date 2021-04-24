// Filen SpelaIn.java

import javax.swing.*;

public class SpelaIn {
  public static void main(String[] arg) {
    String s = JOptionPane.showInputDialog("Starttid (tt.mm)?");
    int i = s.indexOf('.');
    int tim1 = Integer.parseInt(s.substring(0,i));
    int min1 = Integer.parseInt(s.substring(i+1));
    int tid1 = tim1 * 60 + min1;
    s = JOptionPane.showInputDialog("Sluttid (tt.mm)?");
    i = s.indexOf('.');
    int tim2 = Integer.parseInt(s.substring(0,i));
    int min2 = Integer.parseInt(s.substring(i+1));
    int tid2 = tim2 * 60 + min2;
    JOptionPane.showMessageDialog(null, "Längd: " + (tid2-tid1) + " minuter"); 
  }
}

// Alternativ lösning

public class SpelaIn {
  public static int lasTid(String txt) {
    String s = JOptionPane.showInputDialog(txt + " (tt.mm)?"); 
    int i = s.indexOf('.');
    int tim = Integer.parseInt(s.substring(0,i));
    int min = Integer.parseInt(s.substring(i+1));
	return tim * 60 + min;
  }
  
  public static void main(String[] arg) {
    int t1 = lasTid("Starttid");
	int t2 = lasTid("Sluttid");
    JOptionPane.showMessageDialog(null, "Längd: " + (t2-t1) + " minuter"); 
  }
}


