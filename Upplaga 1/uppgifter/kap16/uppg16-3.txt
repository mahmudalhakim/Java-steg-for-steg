// Filen Medelvarde.java
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import java.util.*;

public class Medelvarde {
  public static void main(String[] arg) {
    String s = showInputDialog("Skriv ett godtyckligt antal tal");
    if (s == null)
      exit(0);
    Scanner sc = new Scanner(s);
    double sum = 0;
    int n = 0;
    while (sc.hasNextDouble()) {
      sum += sc.nextDouble();
	  n++;
    }
    showMessageDialog(null, "Medelvärde: " + sum/n);
  }
}
	