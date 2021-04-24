// Rekommenderat filnamn: Tid.java

import java.util.*;

class Tid {

 static String klockan() {
    String s = Calendar.getInstance().getTime().toString();
    int i = s.indexOf(':');
    return s.substring(i-2, i+6);
  }

  // Testprogram
  public static void main (String[] arg) {
    System.out.println("Klockan är: " + klockan());
  }
}
