// Rekommenderat filnamn: Personnummer.java

class Personnummer {
  private String nr;

  private int toInt(String str, int i) {
    if (Character.isDigit(str.charAt(i)))
      return Integer.parseInt(str.substring(i, i+1));
    else
      throw new IllegalArgumentException();
  }
  
  Personnummer(String s) {
    // Kontrollera att numret är korrekt
    int k = s.indexOf('-');
    if (k != 6 || s.length() != 11) 
      throw new IllegalArgumentException();
    String t = s.substring(0,6) + s.substring(7);   // ta bort tecknet '-'
    // beräkna kontrollsumman
    int sum = 0; 
    for (int i=0; i<9; i++) {
      int tal = toInt(t, i);
      int j = tal * (2-i%2);   // multiplicera med 2 eller 1    
      sum += j/10 + j%10;      // addera siffrorna i resultatet till summan
    }
    sum %= 10;
    if ((toInt(t,9) + sum) % 10 != 0)
      throw new IllegalArgumentException();
    // Korrekt!
    nr = s;
  } 

  @Override
  public String toString() {
    return nr;
  }

  boolean ärKvinna() {
    return toInt(nr, 9) % 2 == 0;
  }

  boolean ärMan() {
    return !ärKvinna();
  } 
}      
 
