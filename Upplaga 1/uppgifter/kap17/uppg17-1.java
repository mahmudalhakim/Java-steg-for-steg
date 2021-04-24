// Filen Djur.java

public abstract class Djur {
  protected int l�n;
  protected double vik;

  public Djur(int l, double v) {
    l�n=l;
    vik=v;
  }

  public int l�ngd() {
    return l�n;
  }

  public double vikt() {
    return vik;
  }
  
  public abstract String l�te();

  public static void main(String[] arg) {
    Djur[] d = new Djur[20];
    d[0] = new Hund(30, 6, "Tax");
    d[1] = new Orm(150, 2, true);
    d[2] = new Hund(70, 20, "Labrador");
    d[3] = new Orm(100, 1.5, false); 
    d[4] = new Kr�ka(20, 1);
    for (int i=0; i<d.length; i++)
      if (d[i] != null)   
        System.out.println(d[i].l�te());
  }
}

abstract class D�ggdjur extends Djur {
  public D�ggdjur(int l, double v) {
    super(l,v);
  }
}

abstract class Kr�ldjur extends Djur {
  public Kr�ldjur(int l, double v) {
    super(l,v);
  }
}

abstract class F�gel extends Djur {
   public F�gel(int l, double v) {
    super(l,v);
  }
}

class Hund extends D�ggdjur {
  protected String hundras;

  public Hund(int l, double v, String r) {
    super(l,v);
    hundras = r;
  }

  public String ras() {
    return hundras;
  }

  @Override
  public String l�te() {
    if (vik < 3)
      return "Viff";
    else if (vik < 10)
      return "Vov";
    else
      return "VOFF";
  }
}

class Orm extends Kr�ldjur {
  protected boolean gift;

  public Orm(int l, double v, boolean g) {
    super(l,v);
    gift=g;
  }

  public boolean giftig() {
    return gift;
  }
  
  @Override
  public String l�te() {
    if (gift) 
      return "SSSSSSS...";
    else
      return "sssssss...";
  }
}

class Kr�ka extends F�gel {

  public Kr�ka(int l, double v) {
    super(l,v);
  }

  @Override
  public String l�te() {
    return "Krax, Krax";
  }
}



