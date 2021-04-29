import java.util.*;
class BakText {
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.println("Skriv en text");
    String s = scan.nextLine();
    System.out.println(StringMetoder.bakl�nges(s));
  } 
}

class StringMetoder {
  static int antal(String s, char c) {
    int n = 0;
    for (int i=0; i<s.length(); i++) 
      if (s.charAt(i)== c)
        n++;
    return n;
  }

  static int s�kF�rstaBland(String s, String s�kta, int start) {
    for (int i=start; i<s.length(); i++) 
      if (s�kta.indexOf(s.charAt(i)) >= 0)
        return i;
    return -1;
  }

  static String bakl�nges(String s) {
    String r = "";
      for (int i=s.length()-1; i>=0; i--)
        r = r + s.charAt(i);
    return r;
  }
}