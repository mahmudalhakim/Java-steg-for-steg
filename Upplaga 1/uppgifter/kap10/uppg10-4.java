// Filen BMI.java

import java.io.*;
import java.util.*;

public class BMI { 
  public static void main(String[] arg) throws IOException {
    BufferedReader inström = new BufferedReader
                            (new FileReader(arg[0]));
    PrintWriter utström = new PrintWriter
                         (new BufferedWriter
                         (new FileWriter(arg[1])));                         
    while(true) {
      String rad1 = inström.readLine();
      if (rad1 == null)
        break;
      String rad2 = inström.readLine();
      Scanner sc = new Scanner(rad2);
      int ålder = sc.nextInt();
      int längd = sc.nextInt();
      double vikt = sc.nextDouble();
      double bmi = vikt / (0.01*längd*0.01*längd);
      if (bmi > 30) {
        utström.println(rad1);
        utström.println(rad2);
      }
    }
    inström.close();
    utström.close();
  }
}
