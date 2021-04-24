// Rekommenderat filnamn: Datum.java 

class Datum {
  public static void main (String[] arg) {
    String a, b;
    a = " Erik Andersson 860314-2714  ";
    a = a.trim();  // a får värdet "Erik Andersson 860314-2714"
    int i = a.lastIndexOf(' ') + 1;   // i får värdet 15
    int j = a.indexOf('-');           // j får värdet 21   
    b = a.substring(i+4, j) + '/' + a.substring(i+2, j-2); 
    System.out.println(b);
  }
}
