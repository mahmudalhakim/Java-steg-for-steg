// Rekommenderat filnamn: BMI.java

import java.io.*;
import java.util.*;

class BMI { 
  public static void main(String[] arg) throws IOException {
    var tangentbord = new Scanner(System.in);
    System.out.print("Vad heter infilen? "); 
    String namn1 = tangentbord.nextLine();
    BufferedReader inström = new BufferedReader
                            (new FileReader(namn1));
    System.out.print("Vad heter utfilen? "); 
    String namn2 = tangentbord.nextLine();
    PrintWriter utström = new PrintWriter
                         (new BufferedWriter
                         (new FileWriter(namn2)));                         
    while(true) {
      String rad1 = inström.readLine();
      if (rad1 == null)
        break;
      String rad2 = inström.readLine();
      var sc = new Scanner(rad2);
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
