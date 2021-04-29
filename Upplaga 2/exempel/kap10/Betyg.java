import java.io.*;
class Betyg {
  public static void main(String[] arg) throws IOException{
    // Skapa en ström från kommandofönstret
    var input = new BufferedReader
               (new InputStreamReader(System.in));
    // Läs filens namn från kommandofönstret
    System.out.print("Filens namn? "); 
    String filnamn = input.readLine();
    // Skapa en ström från filen
    var inström = new BufferedReader
                            (new FileReader(filnamn));
    // Läs filen
    while (true) {
      String rad1 = inström.readLine();   // läs namnet
      if (rad1 == null)  // är filen slut?
        break;   // ja!
      String rad2 = inström.readLine();   // läs poängen
      int poäng = Integer.parseInt(rad2);
      if (poäng >= 50)   // godkänd?
        System.out.println(rad1 + " " + poäng); 
    }
  }      
}