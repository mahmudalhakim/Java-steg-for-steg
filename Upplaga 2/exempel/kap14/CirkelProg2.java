import java.util.*;
class CirkelProg2 {
  public static void main(String[] arg) {
    var c1 = new Cirkel(); 
    var c2 = new Cirkel();
    Scanner scan = new Scanner(System.in);           
    System.out.print("Den f�rsta cirkelns radie? ");
    c1.s�ttRadie(scan.nextDouble());
    System.out.print("Den andra cirkelns radie? ");
    c2.s�ttRadie(scan.nextDouble());
    System.out.format("Den f�rsta cirkeln har arean %.3f"+
                      " och omkretsen %.3f\n" +
                      "Den andra cirkeln har arean %.3f"+
                      " och omkretsen %.3f", 
                      c1.area(), c1.omkr(), 
                      c2.area(), c2.omkr()); 
  }
}