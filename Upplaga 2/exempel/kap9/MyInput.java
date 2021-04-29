import java.util.*;
class MyInput {
  static int readInt(Scanner scan, String txt) {
    System.out.print(txt);
    while (!scan.hasNextInt()) {  // något fel?
      if (!scan.hasNext())        // end-of-file ?
        System.exit(0);
      scan.nextLine(); // hoppa över den felaktiga raden
      System.out.print("Felaktigt heltal\n" + txt);
    }
    return scan.nextInt();
  }
}