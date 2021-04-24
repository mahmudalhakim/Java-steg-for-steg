// Filen Bensin2.java

import java.util.*;

class Bensin2 {

  public static void main(String[] arg) {
    System.out.print("Dagens mätarställning? "); System.out.flush();
	Scanner sc = new Scanner(System.in);
    int m1 = sc.nextInt();
    System.out.print("Mätarställning för ett år sedan? "); System.out.flush();
    int m2 = sc.nextInt();
    System.out.print("Antal liter förbrukad bensin? "); System.out.flush();
    double li = sc.nextDouble();
    System.out.format("Antal körda mil: %13d\n", (m1-m2));
    System.out.format("Antal liter bensin: %10.2f\n", li);
    System.out.format("Förbrukning per mil: %9.2f\n", li/(m1-m2)); 
  }
}


