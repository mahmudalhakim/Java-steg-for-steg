// Rekommenderat filnamn: Summa.java

class Summa {
  public static void main (String[] arg) {
    double term = 1, 
           sum  = 0;
    int tecken = 1;
    
    for (int k=2; Math.abs(term)>=1.0e-5 && k < 20; k++) {
      sum = sum + term;
      tecken = -tecken;
      term = tecken * 1.0/k;
    }   
    System.out.println("Summan blir: " + sum);
  }
}


