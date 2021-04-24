// Filen Medelvarde.java

import java.util.*;

public class Medelvarde {

  public static void main(String[] arg) {
    ArrayList<Double> l = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextDouble())
      l.add(sc.nextDouble());

    double sum = 0;
    for (Double d : l) 
      sum += d;
    System.out.println("Medelvärde: " + sum/l.size());
  }
}
    






