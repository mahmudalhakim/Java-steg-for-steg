// Rekommenderat filnamn: SlumpNamn.java

import java.util.*;
import java.io.*;  

class SlumpNamn { 
  public static void main(String[] arg) throws IOException {
    var tangentbord = new Scanner(System.in);
    System.out.print("Vad heter filen med namn? "); 
    String filnamn = tangentbord.nextLine();
    BufferedReader inström = new BufferedReader
                            (new FileReader(filnamn));
    String namn = "";
    int n = 0;
    while(true) {
      namn = inström.readLine();
      if (namn == null)
        break;
      n++;
    }
    inström.close();

    inström = new BufferedReader
             (new FileReader(filnamn)); 
    int k = (int) (Math.random() * n);  // 0 <= k < n
    for (int i=0; i <= k ; i++) 
      namn = inström.readLine();
    System.out.println(namn);
    inström.close();
  }
}      
