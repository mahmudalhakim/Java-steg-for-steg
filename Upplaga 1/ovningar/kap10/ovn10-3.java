// Filen Betyg2.java 
import java.io.*;

public class Betyg2 {
  public static void main(String[] arg) throws IOException{
    // Skapa en ström från kommandofönstret
    BufferedReader input = new BufferedReader
                       (new InputStreamReader(System.in));
    // Läs filernas namn från kommandofönstret
    System.out.print("Vad heter filen med resultaten? "); System.out.flush();
    String filnamn1 = input.readLine();
    System.out.print("Vad skall den nya filen heta? "); System.out.flush();
    String filnamn2 = input.readLine();

    // Skapa strömmar 
    BufferedReader inström = new BufferedReader
                            (new FileReader(filnamn1));
    PrintWriter utström = new PrintWriter
                         (new BufferedWriter
                         (new FileWriter(filnamn2)));

    // Läs resultatfilen och skriv ut de godkända eleverna
    while (true) {
      String rad1 = inström.readLine();   // läs namnet
      if (rad1 == null)  // är filen slut?
        break;   // ja!
      String rad2 = inström.readLine();   // läs poängen
      int poäng = Integer.parseInt(rad2);
      if (poäng >= 50)   // godkänd?
        utström.println(rad1 + " " + poäng); 
    }
    utström.close();
  }      
}

