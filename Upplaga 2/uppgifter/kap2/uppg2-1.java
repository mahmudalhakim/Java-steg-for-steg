// Filen Tid.java

import java.util.*;

class Tid {
  public static void main (String[] arg) {
    String d =  Calendar.getInstance().getTime().toString();
    int i = d.indexOf(':');    // index för första ':'
    System.out.println("Klockan är: " + d.substring(i-2, i+6));             
  }
}
