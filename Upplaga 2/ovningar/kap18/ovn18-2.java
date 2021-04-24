// Filen NamnListor.java

import java.util.*;
import java.io.*;

public class NamnListor {

  public static void main(String[] arg) throws IOException {
    LinkedList<String> l1 = new LinkedList<>();

    BufferedReader inström = new BufferedReader
                        (new FileReader("namn.txt"));
    while (true) {
      String namn = inström.readLine();
      if (namn == null) 
        break; 
      l1.add(namn);
    }
    System.out.println("Antal personer i l1: " + l1.size());
    int n = 0;  // antal Johansson
    for (String s : l1) 
      if (s.indexOf("Johansson") >= 0)
        n++;
    System.out.println("Antal Johansson: " + n);

    LinkedList<String> l2 = new LinkedList<>();
    for (String s : l1) 
      l2.add(0, s);
    for (String s : l2) 
      System.out.println(s);
  }
}
    






