// Filen TestaSortering.java

import java.util.*;  

public class TestaSortering {

  public static boolean ärSorterat(List<Double> l) {
    Double förra = l.get(0);
    for (Double d : l) {
      if (d < förra)
        return false;
      förra = d;
    }
    return true;
  }

  public static void main(String[] arg) {
    
    List<Double> a = new LinkedList<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("Skriv in talen. Avsluta med ctrl-z");
    while (sc.hasNextDouble()) 
      a.add(sc.nextDouble());
    if (ärSorterat(a))
      System.out.println("Listan är sorterad");
    else
      System.out.println("Listan är inte sorterad");
  }
}    
    
      
    
