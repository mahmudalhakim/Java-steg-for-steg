//  Rekommenderat filnamn: FilTest2.java
import java.io.*;

class FilTest2 {
 public static void main(String[] arg) throws IOException {
    for (int filnr=0; filnr < arg.length; filnr++) {
      BufferedReader fil = new BufferedReader
                          (new FileReader(arg[filnr]));
      int antalRader  = 0, 
          antalTecken = 0;
      while (true) {
        String rad = fil.readLine();
        if (rad == null)
          break;
        antalRader++; 
        antalTecken = antalTecken + rad.length();
      }
      System.out.println("Filen " + arg[filnr] + " innehåller " + 
                        antalRader + " rader och " + 
                        antalTecken + " tecken");
      fil.close();
    }
  }      
}
