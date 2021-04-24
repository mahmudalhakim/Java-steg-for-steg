// Filen Hej4.java

import javax.swing.*; 

public class Hej4 {
  public static void main (String[] arg) {
    // variabeldeklarationer
    String förnamn;
    String efternamn;
    String hälsning;
    // läs in förnamnet
    förnamn = JOptionPane.showInputDialog("Förnamn?");
    // läs in efternamnet
    efternamn = JOptionPane.showInputDialog("Efternamn?");
    // bilda en hälsningstext
    hälsning = "Välkommen " + förnamn + " " + efternamn;
    // skriv ut hälsningstexten
    JOptionPane.showMessageDialog(null, hälsning);
  }
}
