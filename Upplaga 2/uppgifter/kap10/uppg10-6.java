// Rekommenderat filnamn: TillRovare.java

import java.io.*;
import java.util.*;

class TillRovare {
  public static void main(String[] arg) throws IOException {
    BufferedReader input = new BufferedReader
                          (new InputStreamReader(System.in)); 
    System.out.print("Vad ska utfilen heta? "); 
    String namn= input.readLine();
    PrintWriter utström = new PrintWriter
                     (new BufferedWriter
                     (new FileWriter(namn)));
    String kons = "bcdfghjklmnpqrstvxzBCDFGHJKLMNPQRSTVXZ";
    System.out.println("Skriv texten som ska översättas");
    while (true) {
      String s1 = input.readLine();  // läs nästa rad
      if (s1 == null)
        break;
      String s2 = "";  // rad som ska skrivas ut
      // löp igenom alla tecken på den inlästa raden
      for (int i=0; i< s1.length(); i++) {
        char c = s1.charAt(i);
        s2 = s2 + c;
        if (kons.indexOf(c)>=0)   // är c en konsonant?
          s2 = s2 + 'o' + c;      // ja
      }
      utström.println(s2);
    }
    utström.close();
  }
}