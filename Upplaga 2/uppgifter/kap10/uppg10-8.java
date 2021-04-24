// Rekommenderat filnamn: Regn.java

import java.io.*;
import java.util.*;
import javax.swing.*;

class Regn {
  public static void main(String[] arg) throws IOException {
    String namn = "";
    JFileChooser fc = new JFileChooser();
    int resultat = fc.showOpenDialog(null);
    if (resultat == JFileChooser.APPROVE_OPTION)
      namn = fc.getSelectedFile().getAbsolutePath();
    else
      System.exit(0);
    var inFil = new Scanner(new FileReader(namn));
    System.out.println(" År    0         1         2         3 x1000 mm");
    while (inFil.hasNextInt()) {
      int år  = inFil.nextInt();
      int ned = inFil.nextInt();
      ned = (int) (ned/100.0 + 0.5);
      System.out.format("%1d   ", år);
      for (int i=0; i<= ned; i++)
        System.out.print("*");
      System.out.println();
    }
  }
}

      

