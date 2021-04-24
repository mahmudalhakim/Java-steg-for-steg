// Rekommenderat filnamn: VisaTest.java

// Metoden kan testas med följande klass:

class VisaTest {
  public static void main (String[] arg) {
    MinaMetoder.visaInfo();
  }
}

// Metoden visaInfo kan t.ex. läggas i klassen MinaMetoder:

class MinaMetoder {

  static void visaInfo() {
    System.out.println("Operativsystem: " + System.getProperty("os.name") +
                       "\nAnvändare: " + System.getProperty("user.name"));

  }

  // Andra metoder
  // ...
}
