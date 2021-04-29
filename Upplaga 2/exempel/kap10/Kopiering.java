import java.io.*;
class Kopiering {
 public static void main(String[] arg) throws IOException{
    var input = new BufferedReader
               (new InputStreamReader(System.in));
    System.out.print("Vad heter filen som ska läsas? ");
    String filnamn1 = input.readLine();
                     
    // Skapa en ström från infilen
    var inström = new BufferedReader
                 (new FileReader(filnamn1));
    // Skapa en ström till utfilen
    System.out.print("Vad heter filen som ska skrivas? ");
    String filnamn2 = input.readLine();
    var utström = new PrintWriter
                 (new BufferedWriter
                 (new FileWriter(filnamn2)));
    // Läs infilen och kopiera till utfilen
    int radNr = 0;
    while (true) {
      String rad = inström.readLine();      // läs infilen
      if (rad == null)
        break;
      radNr++;
      utström.println(radNr + ": " + rad); // skriv utfilen
    }
    System.out.println(radNr + " rader kopierade från " +
                       filnamn1 + " till " + filnamn2);
    utström.close();  // OBS! Viktigt
  }      
} 