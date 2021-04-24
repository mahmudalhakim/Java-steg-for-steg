// Rekommenderat filnamn: AnagramKlass.java

import java.util.*;

class AnagramKlass {

  static boolean ärAnagram(String s1, String s2) {
    s1 = Blank.blankaBort(s1);
    s2 = Blank.blankaBort(s2);
    if (s1.length() != s2.length())
      return false;
    for (int i=0; i<s1.length(); i++)
      if (antal(s1, s1.charAt(i)) != antal(s2, s1.charAt(i)))
        return false;
    return true;
  }
  
  static String blankaBort(String s) {
    String r = "";
    for (int i=0; i<s.length(); i++)
      if (s.charAt(i) != ' ')
        r = r + s.charAt(i);
    return r;
  }

  static int antal (String s, char c) {
    int n = 0;
    for (int i=0; i<s.length(); i++) 
      if (s.charAt(i)== c)
        n++;
    return n;
  }

  // testprogram
  public static void main (String[] arg) {
    var scan = new Scanner(System.in);
    System.out.print("Den första texten? ");
    String a = scan.nextLine().toLowerCase();
    System.out.print("Den andra texten ");
    String b = scan.nextLine().toLowerCase();
    if (ärAnagram(a, b))
      System.out.println("Anagram");
    else 
      System.out.println("Inte anagram");	  
  }
}
