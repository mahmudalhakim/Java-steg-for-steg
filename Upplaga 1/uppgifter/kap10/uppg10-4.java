// Filen BMI.java

import java.io.*;
import java.util.*;

public class BMI { 
  public static void main(String[] arg) throws IOException {
    BufferedReader instr�m = new BufferedReader
                            (new FileReader(arg[0]));
    PrintWriter utstr�m = new PrintWriter
                         (new BufferedWriter
                         (new FileWriter(arg[1])));                         
    while(true) {
      String rad1 = instr�m.readLine();
      if (rad1 == null)
        break;
      String rad2 = instr�m.readLine();
      Scanner sc = new Scanner(rad2);
      int �lder = sc.nextInt();
      int l�ngd = sc.nextInt();
      double vikt = sc.nextDouble();
      double bmi = vikt / (0.01*l�ngd*0.01*l�ngd);
      if (bmi > 30) {
        utstr�m.println(rad1);
        utstr�m.println(rad2);
      }
    }
    instr�m.close();
    utstr�m.close();
  }
}
