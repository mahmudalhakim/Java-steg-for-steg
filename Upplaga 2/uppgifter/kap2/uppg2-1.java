// Filen Tid.java

import java.util.*;

class Tid {
  public static void main (String[] arg) {
    String d =  Calendar.getInstance().getTime().toString();
    int i = d.indexOf(':');    // index f�r f�rsta ':'
    System.out.println("Klockan �r: " + d.substring(i-2, i+6));             
  }
}
