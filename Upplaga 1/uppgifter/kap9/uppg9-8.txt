// Filen Regn.java

import java.io.*;

public class Regn {
  public static void main(String[] arg) throws IOException{
    BufferedReader input = new BufferedReader
                          (new InputStreamReader(System.in));
    System.out.println(" År   0         1         2         3 x1000 mm");
    int år = 0;
    while (true) {
      String s = input.readLine();
      if (s == null)
        break;
      int ned = Integer.parseInt(s);
      ned = (int) (ned/100.0 + 0.5);
      System.out.format("%3d   ", ++år);
      for (int i=0; i<= ned; i++)
        System.out.print("*");
      System.out.println();
    }
  }
}

      

