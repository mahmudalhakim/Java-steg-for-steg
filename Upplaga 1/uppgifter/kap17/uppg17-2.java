// Filen Figur.java
import java.util.*;

class Punkt {
  public double x, y;

  public Punkt() {}
  
  public Punkt(double xx, double yy) {
    x=xx; y=yy;
  }

  public Punkt(Punkt p) {
    x=p.x; y=p.y;
  }

  public double avstånd(Punkt p) { 
    // ger avståndet mellan denna punkt och punkten p 
    return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
  }
}

public abstract class Figur  {
  protected Punkt startp;

  public Figur() {
    startp = new Punkt();
  }

  public Figur(double x, double y) {
    startp = new Punkt(x,y);
  }

  public Figur(Punkt p) {
    startp = new Punkt(p);
  }

  public void flytta_till(Punkt p) {
     startp.x = p.x;
     startp.y = p.y;
  }

  public void flytta(double dx, double dy) {
    startp.x += dx; startp.y += dy;
  }

  public Punkt startpunkt() {
    return new Punkt(startp);  // returnera en kopia
  }

  public abstract double area();

  public static void main(String[] arg) {
    List<Figur> f = new ArrayList<Figur>();
    f.add(new Cirkel(2, 1, 1));
    f.add(new Cirkel(3, new Punkt(1,0)));
    f.add(new Rektangel(4, 5, 2, -2));
    f.add(new Rektangel(6, 7, new Punkt(-1, 3)));
    f.add(new Triangel(new Punkt(0,0), new Punkt(1,1), new Punkt(1,0)));
    f.add(new Triangel(new Punkt(1,1), new Punkt(2,-1), new Punkt(0,-3)));
    for (Figur fig : f) 
     System.out.println(fig.area());
  }
}


class Cirkel extends Figur {
  private double r;

  public Cirkel(double rad, double x, double y) {
    super(x,y);
    r=rad;
  }

  public Cirkel(double rad, Punkt mitt) {
    super(mitt);
    r=rad;
  }

  public double radie() {
    return r;
  }

  @Override
  public double area() {
    return Math.PI*r*r;
  }
}

class Rektangel extends Figur {
  private double b, h;  // bredd och höjd

  // Övre vänstra hörnet ges som starpunkt
  public Rektangel(double br, double hö, double x, double y) {
    super(x,y);
    b=br; h=hö;
  }

  public Rektangel(double br, double hö, Punkt start) {
    super(start);
    b=br; h=hö;
  }

  public double bredd() {
    return b;
  }

  public double höjd() {
    return h;
  }
  
  @Override
  public double area() {
    return b*h;
  }
}

class Triangel extends Figur {
  private Punkt p2, p3;  // punkterna anges relativt startpunkten

  public Triangel(Punkt pa, Punkt pb, Punkt pc) {
    super(pa);
    p2 = new Punkt(pb.x-pa.x, pb.y-pa.y);
    p3 = new Punkt(pc.x-pa.x, pc.y-pa.y);
  }

  public Punkt horn(int i) {
    if (i==1)
      return startp;
    else if (i==2)
      return new Punkt(p2.x+startp.x, p2.y+startp.y);
    else if (i==3)
      return new Punkt(p3.x+startp.x, p3.y+startp.y);
    else {
     System.out.println("Felaktigt argument");
     return startp;  // något måste returneras i alla fall
    }
  }

  @Override
  public double area()
  {
    double a = startp.avstånd(p2), b = startp.avstånd(p3), c = p2.avstånd(p3);
    // a, b och c är sidornas längder
    double s = (a+b+c)/2;
    return Math.sqrt(s*(s-a)*(s-b)*(s-c));  // Herons formel
  }
}



