// Rekommenderat filnamn: SokText.java

import java.util.*;
import java.io.*;  

class SokText { 
  public static void main(String[] arg) throws IOException {
    var tangentbord = new Scanner(System.in);
    System.out.print("Vad heter den befintliga filen? "); 
    String namn1 = tangentbord.nextLine();
    BufferedReader inström = new BufferedReader
                            (new FileReader(namn1));
    System.out.print("Vad skall den nya filen heta? "); 
    String namn2 = tangentbord.nextLine(); 
    PrintWriter utström = new PrintWriter
                     (new BufferedWriter
                     (new FileWriter(namn2)));
    System.out.print("Vilken text söker du? "); 
    String txt = tangentbord.nextLine(); 

    while(true) {
      String s = inström.readLine();
      if (s == null)
        break;
      if (s.indexOf(txt) >= 0)
        utström.println(s); 
    }
    inström.close();
    utström.close();
  }
}
  
