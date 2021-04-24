// Rekommenderat filnamn: TillRovare.java

import java.io.*;
import java.util.*;

class TillRovare {
  public static void main(String[] arg) throws IOException {
    BufferedReader input = new BufferedReader
                          (new InputStreamReader(System.in)); 
    System.out.print("Vad ska utfilen heta? "); 
    String namn= input.readLine();
    PrintWriter utstr�m = new PrintWriter
                     (new BufferedWriter
                     (new FileWriter(namn)));
    String kons = "bcdfghjklmnpqrstvxzBCDFGHJKLMNPQRSTVXZ";
    System.out.println("Skriv texten som ska �vers�ttas");
    while (true) {
      String s1 = input.readLine();  // l�s n�sta rad
      if (s1 == null)
        break;
      String s2 = "";  // rad som ska skrivas ut
      // l�p igenom alla tecken p� den inl�sta raden
      for (int i=0; i< s1.length(); i++) {
        char c = s1.charAt(i);
        s2 = s2 + c;
        if (kons.indexOf(c)>=0)   // �r c en konsonant?
          s2 = s2 + 'o' + c;      // ja
      }
      utstr�m.println(s2);
    }
    utstr�m.close();
  }
}