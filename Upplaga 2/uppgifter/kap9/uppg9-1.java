// Rekommenderat filnamn: Bensin2.java

import java.util.*;

class Bensin2 {

  public static void main(String[] arg) {
    System.out.print("Dagens m�tarst�llning? ");
	 Scanner sc = new Scanner(System.in);
    int m1 = sc.nextInt();
    System.out.print("M�tarst�llning f�r ett �r sedan? ");
    int m2 = sc.nextInt();
    System.out.print("Antal liter f�rbrukad bensin? ");
    double li = sc.nextDouble();
    System.out.format("Antal k�rda mil: %13d\n", (m1-m2));
    System.out.format("F�rbrukning per mil: %9.2f\n", li/(m1-m2)); 
  }
}


