// Rekommenderat filnamn: Vara.java

import java.util.*;

class Vara {
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    double pris = MyInput.readDouble(scan, "Pris (inkl. moms)? ");
    int procent = MyInput.readInt(scan, "Momssats? ");
    double exkl = pris / (1 + 0.01 * procent);
    double moms = pris - exkl;
    System.out.println("Pris (exkl. moms): " + exkl + "\nMoms: " + moms);
  }
}

class MyInput {
  static int readInt(Scanner scan, String txt) {
    System.out.print(txt);
    while (!scan.hasNextInt()) {
      if (!scan.hasNext())  // end-of-file ?
        System.exit(0);
      scan.nextLine(); // hoppa över den felaktiga raden
      System.out.print("Felaktigt heltal\n" + txt);
    }
    return scan.nextInt();
  }
  
  static double readDouble(Scanner scan, String txt) {
    System.out.print(txt);
    while (!scan.hasNextDouble()) {
      if (!scan.hasNext())  // end-of-file ?
        System.exit(0);
      scan.nextLine(); // hoppa över den felaktiga raden
      System.out.print("Felaktigt heltal\n" + txt);
    }
    return scan.nextDouble();
  }
}
