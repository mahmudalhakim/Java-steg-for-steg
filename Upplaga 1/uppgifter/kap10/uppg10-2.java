// Filen AaAeOe.java

import java.io.*;

public class AaAeOe { 

  public static void main(String[] arg) throws IOException {

    BufferedReader tangentbord = new BufferedReader
                            (new InputStreamReader(System.in));
    System.out.print("Vad heter filen? "); System.out.flush();
    String namn = tangentbord.readLine();
    BufferedReader instr�m = new BufferedReader
                            (new FileReader(namn));

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
      System.out.println(r);
    }
  }
}
