// Filen Djur.java

public abstract class Djur {
  protected int län;
  protected double vik;

  public Djur(int l, double v) {
    län=l;
    vik=v;
  }

  public int längd() {
    return län;
  }

  public double vikt() {
    return vik;
  }
  
  public abstract String läte();

  public static void main(String[] arg) {
    Djur[] d = new Djur[20];
    d[0] = new Hund(30, 6, "Tax");
    d[1] = new Orm(150, 2, true);
    d[2] = new Hund(70, 20, "Labrador");
    d[3] = new Orm(100, 1.5, false); 
    d[4] = new Kråka(20, 1);
    for (int i=0; i<d.length; i++)
      if (d[i] != null)   
        System.out.println(d[i].läte());
  }
}

abstract class Däggdjur extends Djur {
  public Däggdjur(int l, double v) {
    super(l,v);
  }
}

abstract class Kräldjur extends Djur {
  public Kräldjur(int l, double v) {
    super(l,v);
  }
}

abstract class Fågel extends Djur {
   public Fågel(int l, double v) {
    super(l,v);
  }
}

class Hund extends Däggdjur {
  protected String hundras;

  public Hund(int l, double v, String r) {
    super(l,v);
    hundras = r;
  }

  public String ras() {
    return hundras;
  }

  @Override
  public String läte() {
    if (vik < 3)
      return "Viff";
    else if (vik < 10)
      return "Vov";
    else
      return "VOFF";
  }
}

class Orm extends Kräldjur {
  protected boolean gift;

  public Orm(int l, double v, boolean g) {
    super(l,v);
    gift=g;
  }

  public boolean giftig() {
    return gift;
  }
  
  @Override
  public String läte() {
    if (gift) 
      return "SSSSSSS...";
    else
      return "sssssss...";
  }
}

class Kråka extends Fågel {

  public Kråka(int l, double v) {
    super(l,v);
  }

  @Override
  public String läte() {
    return "Krax, Krax";
  }
}



