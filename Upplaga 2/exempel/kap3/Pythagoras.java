import java.util.*;
class Pythagoras {
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Första sidan? ");
    double a = scan.nextDouble();
	  System.out.print("Andra sidan?  ");
    double b = scan.nextDouble();
    double c = Math.sqrt(a*a + b*b);
    System.out.println("Hypotenusans längd: " + c);
  }
}