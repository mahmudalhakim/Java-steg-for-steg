// Rekommenderat filnamn: Tecken1.java

class Tecken1 {
  public static void main (String[] arg) {
    char c1, c2;
    c1 = '\u00D8';
    c2 = Character.toLowerCase(c1);
    System.out.println(c1);
    System.out.println(c2);
  }
}
