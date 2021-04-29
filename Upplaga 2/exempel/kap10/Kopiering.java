import java.io.*;
class Kopiering {
 public static void main(String[] arg) throws IOException{
    var input = new BufferedReader
               (new InputStreamReader(System.in));
    System.out.print("Vad heter filen som ska l�sas? ");
    String filnamn1 = input.readLine();
                     
    // Skapa en str�m fr�n infilen
    var instr�m = new BufferedReader
                 (new FileReader(filnamn1));
    // Skapa en str�m till utfilen
    System.out.print("Vad heter filen som ska skrivas? ");
    String filnamn2 = input.readLine();
    var utstr�m = new PrintWriter
                 (new BufferedWriter
                 (new FileWriter(filnamn2)));
    // L�s infilen och kopiera till utfilen
    int radNr = 0;
    while (true) {
      String rad = instr�m.readLine();      // l�s infilen
      if (rad == null)
        break;
      radNr++;
      utstr�m.println(radNr + ": " + rad); // skriv utfilen
    }
    System.out.println(radNr + " rader kopierade fr�n " +
                       filnamn1 + " till " + filnamn2);
    utstr�m.close();  // OBS! Viktigt
  }      
} 