import java.util.*;
class MetodDemo {
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Första talet? ");
    double x = scan.nextDouble();
    System.out.print("Andra talet? ");
    double y = scan.nextDouble();
    double mv = Medelklass.medelv(x, y); 
    System.out.println("Medelvärde: " + mv);
  }
}

class Medelklass {
  static double medelv (double a, double b) {
    return (a+b)/2;
  }
}