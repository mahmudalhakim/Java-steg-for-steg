import java.util.*;
class CirkelProg2 {
  public static void main(String[] arg) {
    var c1 = new Cirkel(); 
    var c2 = new Cirkel();
    Scanner scan = new Scanner(System.in);           
    System.out.print("Den första cirkelns radie? ");
    c1.sättRadie(scan.nextDouble());
    System.out.print("Den andra cirkelns radie? ");
    c2.sättRadie(scan.nextDouble());
    System.out.format("Den första cirkeln har arean %.3f"+
                      " och omkretsen %.3f\n" +
                      "Den andra cirkeln har arean %.3f"+
                      " och omkretsen %.3f", 
                      c1.area(), c1.omkr(), 
                      c2.area(), c2.omkr()); 
  }
}