// Filen StackProg.java

import java.util.*;
import java.io.*;

public class StackProg {

  public static void main(String[] arg) throws IOException {
    Stack<String> st = new Stack<>();

    BufferedReader instr�m = new BufferedReader
                        (new FileReader("namn.txt"));
    while (true) {
      String namn = instr�m.readLine();
      if (namn == null) 
        break; 
      st.push(namn);
    }

    while (!st.empty()) 
      System.out.println(st.pop());
  }
}
    






