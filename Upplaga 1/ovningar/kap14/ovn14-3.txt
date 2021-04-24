// Filen SokPunkt.java
import javax.swing.*;
import java.util.*;
import java.io.*;

public class SokPunkt {
  public static void main(String[] arg) throws IOException {

    Punkt[] a = new Punkt[100];  
    Scanner fil = new Scanner(new File("kurva.txt"));
    int n = 0;    // antal punkter
    while (fil.hasNext()) {
      // läs en rad i filen
      a[n] = new Punkt();
      a[n].x = fil.nextDouble();
      a[n].y = fil.nextDouble();
      n++;
    }
 
    // Leta efter punkten i fältet a
    int i = 0;
    for (; i<n; i++) 
      if (a[i].x<0 && a[i].y<0 )
        break;
    if (i < n)  // punkten hittades
      JOptionPane.showMessageDialog(null, "(" + a[i].x + ", " + a[i].y + ")");
    else
      JOptionPane.showMessageDialog(null, 
                             "Kunde inte hitta punkten");    
  }
}
