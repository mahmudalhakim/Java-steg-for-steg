// Rekommenderat filnamn: SkrivTal.java

import java.util.*;

class SkrivTal {

  public static void main(String [] arg) {
    Scanner sc = new Scanner(System.in);
    var tab = new LinkedList<Integer>();
    while (sc.hasNextInt())
      tab.add(sc.nextInt());

    System.out.println("Talen är:");
    int i =0;
    for (Integer tal : tab) {
      if (!tab.subList(0, i).contains(tal))
        System.out.print(tal + "  ");
      i++;
    }
  }
}

