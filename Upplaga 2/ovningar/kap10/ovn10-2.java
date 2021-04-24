// Rekommenderat filnamn: MaxTal2

import java.io.*;

class MaxTal2 { 
  public static void main (String[] arg) throws IOException {
    BufferedReader input = new BufferedReader
                          (new InputStreamReader(System.in));
    String s = input.readLine();
    double st�rst = Double.parseDouble(s);   // f�rsta talet
    while (true) {
      s = input.readLine();
      if (s == null)
        break;
      double tal = Double.parseDouble(s);   // n�sta tal 
      if (tal > st�rst)
        st�rst = tal;
    }
    System.out.println("Det st�rsta talet �r " + st�rst); 
  } 
} 
