// Rekommenderat filnamn: Temperaturer.java
import javax.swing.*;  // om du använder fildialogruta
import java.util.*;    // innehåller klassen Scanner
import java.io.*;      // Innehåller klassen File

class Temperaturer {
  public static void main(String[] arg) throws IOException {
    BufferedReader input = new BufferedReader
                          (new InputStreamReader(System.in)); 
    System.out.print("Filnamn? "); 
    String namn= input.readLine();
	 var sc = new Scanner(new File(namn));

  /* // Alternativ med fildialogruta
    JFileChooser fc = new JFileChooser();
	int resultat = fc.showOpenDialog(null);
	if (resultat != JFileChooser.APPROVE_OPTION) 
	  System.exit(0);
	var sc = new Scanner(fc.getSelectedFile());
 */	
    int n = 0;            // antal temperatuer
    double sum = 0;       // summan av temperaturerna
    double högsta = -273; // högsta temp hittills

    while (sc.hasNextDouble()) {   // finns det fler temperatuer?
      n++;
      double t = sc.nextDouble();     // ja, läs nästa temperatur
      sum += t;
      if (t > högsta)
        högsta = t;
    }
    System.out.println("Högsta temperatur: " + högsta +
                       "\nMedeltemperatur: " + sum/n);
  }      
}
