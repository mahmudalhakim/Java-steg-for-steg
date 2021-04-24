// Filen SkrivTal.java

import java.util.*;

class SkrivTal { 

  public static void main(String [] arg) {
    Scanner sc = new Scanner(System.in);
    int[] tab = new int[1000];
    int antal = 0;
    while (sc.hasNextInt())
      tab[antal++] = sc.nextInt();

    System.out.println("Talen är:");
    for (int i=0; i<antal; i++) {
      boolean funnen = false;
      for (int j=0; j<i && !funnen; j++)
        if (tab[j] == tab[i])
          funnen = true;
      if (!funnen)
        System.out.print(tab[i] + "  ");
    }
    System.out.flush();
  }
}

