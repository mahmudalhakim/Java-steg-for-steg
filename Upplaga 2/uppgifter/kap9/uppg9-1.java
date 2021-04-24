// Rekommenderat filnamn: Bensin2.java

import java.util.*;

class Bensin2 {

  public static void main(String[] arg) {
    System.out.print("Dagens mätarställning? ");
	 Scanner sc = new Scanner(System.in);
    int m1 = sc.nextInt();
    System.out.print("Mätarställning för ett år sedan? ");
    int m2 = sc.nextInt();
    System.out.print("Antal liter förbrukad bensin? ");
    double li = sc.nextDouble();
    System.out.format("Antal körda mil: %13d\n", (m1-m2));
    System.out.format("Förbrukning per mil: %9.2f\n", li/(m1-m2)); 
  }
}


