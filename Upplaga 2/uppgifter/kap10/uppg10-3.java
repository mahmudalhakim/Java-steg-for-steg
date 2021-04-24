// Rekommenderat filnamn: BMI.java

import java.io.*;
import java.util.*;

class BMI { 
  public static void main(String[] arg) throws IOException {
    var tangentbord = new Scanner(System.in);
    System.out.print("Vad heter infilen? "); 
    String namn1 = tangentbord.nextLine();
    BufferedReader instr�m = new BufferedReader
                            (new FileReader(namn1));
    System.out.print("Vad heter utfilen? "); 
    String namn2 = tangentbord.nextLine();
    PrintWriter utstr�m = new PrintWriter
                         (new BufferedWriter
                         (new FileWriter(namn2)));                         
    while(true) {
      String rad1 = instr�m.readLine();
      if (rad1 == null)
        break;
      String rad2 = instr�m.readLine();
      var sc = new Scanner(rad2);
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
