// Rekommenderat filnamn: TestaSortering.java

import java.util.*;  

class TestaSortering {

  static boolean ?rSorterad(List<Double> l) {
    Double f?rra = l.get(0);
    for (Double d : l) {
      if (d < f?rra)
        return false;
      f?rra = d;
    }
    return true;
  }

  public static void main(String[] arg) {
    
    List<Double> a = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Skriv in talen. Avsluta med ctrl-z");
    while (sc.hasNextDouble()) 
      a.add(sc.nextDouble());
    if (?rSorterad(a))
      System.out.println("Listan ?r sorterad");
    else
      System.out.println("Listan ?r inte sorterad");
  }
}    
    
      
    
