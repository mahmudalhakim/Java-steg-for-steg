// Rekommenderat filnamn: VisaTest.java

// Metoden kan testas med f�ljande klass:

class VisaTest {
  public static void main (String[] arg) {
    MinaMetoder.visaInfo();
  }
}

// Metoden visaInfo kan t.ex. l�ggas i klassen MinaMetoder:

class MinaMetoder {

  static void visaInfo() {
    System.out.println("Operativsystem: " + System.getProperty("os.name") +
                       "\nAnv�ndare: " + System.getProperty("user.name"));

  }

  // Andra metoder
  // ...
}
