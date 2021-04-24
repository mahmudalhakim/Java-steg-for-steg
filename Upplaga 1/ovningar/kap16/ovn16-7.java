// Filen Vara.java

public class Vara {
  private String namn;
  private double pris;
  private static double moms;


  public Vara(String n, double p) {
    sättNamn(n);
    sättPris(p);
  }

  public void sättNamn(String n) {
    if (n != null)
      namn = n;
    else
      throw new NullPointerException();
  }

  public void sättPris(double p) {
    if (p >= 0)
      pris = p;
    else
      throw new IllegalArgumentException("Felaktigt pris");
  }

  public String avläsNamn() {
    return namn;
  }

  public double avläsPris() {
    return pris;
  }

  public double försäljningspris() {
    return pris * (1 + moms/100);
  }

  public static void sättMoms(double m) {
    if (m >= 0)
      moms = m;
    else
      throw new IllegalArgumentException("Felaktig moms");
  } 
}   


// Filen VaraTest.java 

public class VaraTest {

  public static void main(String[] arg) {
    Vara.sättMoms(25);

    Vara v1 = new Vara("Metallskruv", 1.50);
    Vara v2 = new Vara("Gångjärn", 27);
    Vara v3 = new Vara("Packning", 3.25);

    System.out.println(v1.avläsNamn() + ",\tpris inkl moms: " + v1.försäljningspris());
    System.out.println(v2.avläsNamn() + ",\tpris inkl moms: " + v2.försäljningspris());  
    System.out.println(v3.avläsNamn() + ",\tpris inkl moms: " + v3.försäljningspris());
  }
}

