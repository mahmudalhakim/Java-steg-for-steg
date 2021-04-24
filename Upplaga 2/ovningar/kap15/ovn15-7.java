// Rekommenderat filnamn: KommunTest.java
import java.text.*;   // Inneh�ller Collator
import java.util.*;   // Inneh�ller Comparator

class KommunTest {
  public static void main(String[] arg) {
    var kom = new Kommun[5];
    for (int i=0; i<kom.length; i++)
      kom[i] = new Kommun();
    kom[0].namn = "Alings�s";
    kom[0].folkm�ngd = 41_579;
    kom[1].namn = "G�vle";
    kom[1].folkm�ngd = 102_700; 
    kom[2].namn = "Dorotea";
    kom[2].folkm�ngd = 2_546;
    kom[3].namn = "Flen";
    kom[3].folkm�ngd = 16_524; 
    kom[4].namn = "Boden";
    kom[4].folkm�ngd = 28_050; 
    var j�mf�rare = new  jfrKommun(); 
    Arrays.sort(kom, j�mf�rare);
    for (var k : kom)
      System.out.println(k);
  }
}
    
class Kommun implements Comparable<Kommun> {
  String namn;
  int folkm�ngd;
  
  public int compareTo(Kommun annan) {
    Collator col = Collator.getInstance();
    col.setStrength(Collator.PRIMARY);
    return col.compare(namn, annan.namn);
  }
  
  @Override
  public String toString() {
    return namn;
  }
}

class jfrKommun implements Comparator<Kommun> {
  public int compare(Kommun k1, Kommun k2) {
    return k1.folkm�ngd - k2.folkm�ngd;
  }
}