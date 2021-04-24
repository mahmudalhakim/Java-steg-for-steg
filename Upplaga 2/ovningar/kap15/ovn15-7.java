// Rekommenderat filnamn: KommunTest.java
import java.text.*;   // Innehåller Collator
import java.util.*;   // Innehåller Comparator

class KommunTest {
  public static void main(String[] arg) {
    var kom = new Kommun[5];
    for (int i=0; i<kom.length; i++)
      kom[i] = new Kommun();
    kom[0].namn = "Alingsås";
    kom[0].folkmängd = 41_579;
    kom[1].namn = "Gävle";
    kom[1].folkmängd = 102_700; 
    kom[2].namn = "Dorotea";
    kom[2].folkmängd = 2_546;
    kom[3].namn = "Flen";
    kom[3].folkmängd = 16_524; 
    kom[4].namn = "Boden";
    kom[4].folkmängd = 28_050; 
    var jämförare = new  jfrKommun(); 
    Arrays.sort(kom, jämförare);
    for (var k : kom)
      System.out.println(k);
  }
}
    
class Kommun implements Comparable<Kommun> {
  String namn;
  int folkmängd;
  
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
    return k1.folkmängd - k2.folkmängd;
  }
}