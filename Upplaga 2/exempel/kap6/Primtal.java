import java.util.*;
class Primtal {
  public static void main (String[] arg) {
    while (true) {
      // Läs in ett tal och avbryt om användaren vill sluta
      var scan = new Scanner(System.in);
      System.out.print("Talet? ");
      int talet = scan.nextInt();
      if (talet <= 0)
        break;
      // Undersök om talet är ett primtal
      boolean ärPrimtal = true;
      for (int k = 2; k<talet; k++)
        if (talet % k == 0)
          ärPrimtal = false;
      // Visa resultatet
      if (ärPrimtal)
        System.out.println("Primtal");
      else
        System.out.println("Ej primtal");
    }
  }
}