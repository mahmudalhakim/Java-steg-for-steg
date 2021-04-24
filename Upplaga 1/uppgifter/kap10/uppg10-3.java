// Filen AaAeOe2.java

import java.io.*;

public class AaAeOe2 { 

  public static void main(String[] arg) throws IOException {

    BufferedReader tangentbord = new BufferedReader
                            (new InputStreamReader(System.in));
    System.out.print("Vad heter filen? "); System.out.flush();
    String namn = tangentbord.readLine();
    BufferedReader instr�m = new BufferedReader
                            (new FileReader(namn));
    File f = File.createTempFile("fil", null);
    PrintWriter utstr�m = new PrintWriter
                     (new BufferedWriter
                     (new FileWriter(f)));
    // Steg 1
    while(true) {
      String s = instr�m.readLine();
      if (s == null)
        break;
      String r = "";
      for (int i=0; i<s.length(); i++) {
        if (s.charAt(i)=='a' && i+1<s.length() && s.charAt(i+1)=='a') {
          r = r + '�';
          i++;
        } 
        else if (s.charAt(i)=='a' && i+1<s.length()&& s.charAt(i+1)=='e') {
          r = r + '�';
          i++;
        } 
        else if (s.charAt(i)=='o' && i+1<s.length() && s.charAt(i+1)=='e') {
          r = r + '�';
          i++;
        }
        else
          r = r + s.charAt(i);         
      }
      utstr�m.println(r);
    }
    instr�m.close();
    utstr�m.close();
    
    // Steg 2
    instr�m = new BufferedReader
               (new FileReader(f));
    utstr�m = new PrintWriter
               (new BufferedWriter
               (new FileWriter(namn)));
    while (true) {
        String rad = instr�m.readLine();
        if (rad == null) // �r den tempor�ra filen slut?
          break; 
        utstr�m.println(rad);  
    }
    instr�m.close();
    utstr�m.close();
  }
}
