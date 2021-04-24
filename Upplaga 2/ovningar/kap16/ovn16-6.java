// Filen Item.java

public class Item {
  private String name;
  private double price;
  private static double vat;

  public Item(String n, double p) {
    setName(n);
    setPrice(p);
  }

  public void setName(String n) {
    if (n != null)
      name = n;
    else
      throw new NullPointerException();
  }

  public void setPrice(double p) {
    if (p >= 0)
      price = p;
    else
      throw new IllegalArgumentException("Felaktigt price");
  }

  public String getName() {
    return name;
  }

  public double getPrice() {
    return price;
  }

  public double sellingPrice() {
    return price * (1 + vat/100);
  }

  public static void setVat(double m) {
    if (m >= 0)
      vat = m;
    else
      throw new IllegalArgumentException("Illegal vat");
  } 
} 

// Filen ItemTest.java 

public class ItemTest {

  public static void main(String[] arg) {
    Item.setVat(25);

    Item v1 = new Item("Metallskruv", 1.50);
    Item v2 = new Item("Gångjärn", 27);
    Item v3 = new Item("Packning", 3.25);

    System.out.println(v1.getName() + ",\tpris inkl moms: " + v1.sellingPrice());
    System.out.println(v2.getName() + ",\tpris inkl moms: " + v2.sellingPrice());  
    System.out.println(v3.getName() + ",\tpris inkl moms: " + v3.sellingPrice());
  }
}