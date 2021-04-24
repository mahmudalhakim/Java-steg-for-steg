// Filen Datum.java

import static java.util.Calendar.*;

class Datum {
  public static void main (String[] arg) {
    System.out.println("Datum och tid:\n" +  
               getInstance().getTime().toString());
  }
}
