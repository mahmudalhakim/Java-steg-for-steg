public class Cirkel {
  // instansvariabler
  public double x, y;     // mittpunktens koordinater
  private double radie;
  
  // instansmetoder  
  public void sättRadie(double r) {  // ändrar radien  
    if (r >= 0)
      radie = r;
    else
      throw new IllegalArgumentException("Negativ radie");
  }
  
  public double avläsRadie() {
    return radie;
  } 

  public double area() {             // beräknar arean
    return Math.PI * radie * radie;
  } 
  
  public double omkr() {             // beräknar omkretsen
    return 2 * Math.PI * radie;
  }

}