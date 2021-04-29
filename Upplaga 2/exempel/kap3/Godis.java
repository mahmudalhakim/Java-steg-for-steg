import java.util.*;
class Godis {
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Hur många gram? ");
    int gram = scan.nextInt();
	  System.out.print("Pris per hekto? ");
    double hgpris = scan.nextDouble();
    double pris = gram * hgpris / 100;
    System.out.println("Det kostar " +  pris + " kr");				   
  }
}