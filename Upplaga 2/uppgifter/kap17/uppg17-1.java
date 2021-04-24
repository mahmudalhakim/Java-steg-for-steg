// Rekommenderat filnamn: Djur.java

abstract class Djur {
  protected int län;
  protected double vik;

  Djur(int l, double v) {
    län=l;
    vik=v;
  }

  int längd() {
    return län;
  }

  double vikt() {
    return vik;
  }
  
  abstract String läte();

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
  Däggdjur(int l, double v) {
    super(l,v);
  }
}

abstract class Kräldjur extends Djur {
  Kräldjur(int l, double v) {
    super(l,v);
  }
}

abstract class Fågel extends Djur {
   Fågel(int l, double v) {
    super(l,v);
  }
}

class Hund extends Däggdjur {
  protected String hundras;

  Hund(int l, double v, String r) {
    super(l,v);
    hundras = r;
  }

  String ras() {
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

  Orm(int l, double v, boolean g) {
    super(l,v);
    gift=g;
  }

  boolean giftig() {
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

  Kråka(int l, double v) {
    super(l,v);
  }

  @Override
  public String läte() {
    return "Krax, Krax";
  }
}



