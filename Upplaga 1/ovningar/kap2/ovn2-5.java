// Filen Hej4.java

import javax.swing.*; 

public class Hej4 {
  public static void main (String[] arg) {
    // variabeldeklarationer
    String f�rnamn;
    String efternamn;
    String h�lsning;
    // l�s in f�rnamnet
    f�rnamn = JOptionPane.showInputDialog("F�rnamn?");
    // l�s in efternamnet
    efternamn = JOptionPane.showInputDialog("Efternamn?");
    // bilda en h�lsningstext
    h�lsning = "V�lkommen " + f�rnamn + " " + efternamn;
    // skriv ut h�lsningstexten
    JOptionPane.showMessageDialog(null, h�lsning);
  }
}
