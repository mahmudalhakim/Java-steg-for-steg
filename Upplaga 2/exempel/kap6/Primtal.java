import java.util.*;
class Primtal {
  public static void main (String[] arg) {
    while (true) {
      // L�s in ett tal och avbryt om anv�ndaren vill sluta
      var scan = new Scanner(System.in);
      System.out.print("Talet? ");
      int talet = scan.nextInt();
      if (talet <= 0)
        break;
      // Unders�k om talet �r ett primtal
      boolean �rPrimtal = true;
      for (int k = 2; k<talet; k++)
        if (talet % k == 0)
          �rPrimtal = false;
      // Visa resultatet
      if (�rPrimtal)
        System.out.println("Primtal");
      else
        System.out.println("Ej primtal");
    }
  }
}