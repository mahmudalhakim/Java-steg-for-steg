import java.io.*;
class Betyg {
  public static void main(String[] arg) throws IOException{
    // Skapa en str�m fr�n kommandof�nstret
    var input = new BufferedReader
               (new InputStreamReader(System.in));
    // L�s filens namn fr�n kommandof�nstret
    System.out.print("Filens namn? "); 
    String filnamn = input.readLine();
    // Skapa en str�m fr�n filen
    var instr�m = new BufferedReader
                            (new FileReader(filnamn));
    // L�s filen
    while (true) {
      String rad1 = instr�m.readLine();   // l�s namnet
      if (rad1 == null)  // �r filen slut?
        break;   // ja!
      String rad2 = instr�m.readLine();   // l�s po�ngen
      int po�ng = Integer.parseInt(rad2);
      if (po�ng >= 50)   // godk�nd?
        System.out.println(rad1 + " " + po�ng); 
    }
  }      
}