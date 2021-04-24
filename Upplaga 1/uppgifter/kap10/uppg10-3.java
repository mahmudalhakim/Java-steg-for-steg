// Filen AaAeOe2.java

import java.io.*;

public class AaAeOe2 { 

  public static void main(String[] arg) throws IOException {

    BufferedReader tangentbord = new BufferedReader
                            (new InputStreamReader(System.in));
    System.out.print("Vad heter filen? "); System.out.flush();
    String namn = tangentbord.readLine();
    BufferedReader inström = new BufferedReader
                            (new FileReader(namn));
    File f = File.createTempFile("fil", null);
    PrintWriter utström = new PrintWriter
                     (new BufferedWriter
                     (new FileWriter(f)));
    // Steg 1
    while(true) {
      String s = inström.readLine();
      if (s == null)
        break;
      String r = "";
      for (int i=0; i<s.length(); i++) {
        if (s.charAt(i)=='a' && i+1<s.length() && s.charAt(i+1)=='a') {
          r = r + 'å';
          i++;
        } 
        else if (s.charAt(i)=='a' && i+1<s.length()&& s.charAt(i+1)=='e') {
          r = r + 'ä';
          i++;
        } 
        else if (s.charAt(i)=='o' && i+1<s.length() && s.charAt(i+1)=='e') {
          r = r + 'ö';
          i++;
        }
        else
          r = r + s.charAt(i);         
      }
      utström.println(r);
    }
    inström.close();
    utström.close();
    
    // Steg 2
    inström = new BufferedReader
               (new FileReader(f));
    utström = new PrintWriter
               (new BufferedWriter
               (new FileWriter(namn)));
    while (true) {
        String rad = inström.readLine();
        if (rad == null) // Är den temporära filen slut?
          break; 
        utström.println(rad);  
    }
    inström.close();
    utström.close();
  }
}
