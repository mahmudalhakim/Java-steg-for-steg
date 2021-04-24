// Rekommenderat filnamn: AaAeOe.java

import java.io.*;
import java.util.*;

class AaAeOe { 

  public static void main(String[] arg) throws IOException {
    var tangentbord = new Scanner(System.in);
    System.out.print("Vad heter filen? "); 
    String namn = tangentbord.nextLine();
    var fil = new Scanner(new FileReader(namn));

    while(fil.hasNextLine()) {
      String s = fil.nextLine();
      for (int i=0; i<s.length(); i++) {
        if (s.charAt(i)=='a' && i+1<s.length() && s.charAt(i+1)=='a') {
          System.out.print('å');
          i++;
        } 
        else if (s.charAt(i)=='a' && i+1<s.length()&& s.charAt(i+1)=='e') {
          System.out.print('ä');
          i++;
        } 
        else if (s.charAt(i)=='o' && i+1<s.length() && s.charAt(i+1)=='e') {
          System.out.print('ö');
          i++;
        }
        else
          System.out.print(s.charAt(i));         
      }
      System.out.println();
    }
  }
}
