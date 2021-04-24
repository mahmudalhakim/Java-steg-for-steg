// Filen Temperaturer2.java
import javax.swing.*;
import java.util.*;    // inneh�ller klassen Scanner
import java.io.*;      // Inneh�ller klassen File

public class Temperaturer2 {
  public static void main(String[] arg) throws IOException {
    String namn = JOptionPane.showInputDialog("Vad heter filen med temperaturer?");
    Scanner sc = new Scanner(new File(namn));
    int n = 0;            // antal temperatuer
    double sum = 0;       // summan av temperaturerna
    double[] temp = new double[100];

    while (sc.hasNextDouble()) {     // finns det fler temperatuer?
      temp[n] = sc.nextDouble();     // ja, l�s n�sta temperatur
      sum += temp[n];
      n++;
    }
    double mv = sum / n;
    String s = "\nH�gre �n medelv�rdet:";
    for (int i=0; i<n; i++)
      if (temp[i] > mv)
        s += "\nrad " + i + ": " + temp[i]; 
  
    JOptionPane.showMessageDialog(null, "Medeltemperatur: " + mv + s);
  }      
}
