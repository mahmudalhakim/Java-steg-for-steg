// Filen KommNamn.java

// Version 1
public class KommNamn {
  public static void main (String[] arg) {
    System.out.println("Linda Johansson");
    System.out.println("Storgatan 1");
    System.out.println("123456789");
  }
} 


// Version 2
public class KommNamn {
  public static void main (String[] arg) {
    System.out.print("Linda Johansson\nStorgatan 1\n123456789");
    System.out.flush();
  }
}

