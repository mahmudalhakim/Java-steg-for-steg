// Rekommenderat filnamn: Figur.java
import java.util.*;

abstract class Figur  {
  protected Punkt startp;

  Figur() {
    startp = new Punkt();
  }

  Figur(double x, double y) {
    startp = new Punkt(x,y);
  }

  Figur(Punkt p) {
    startp = new Punkt(p);
  }

  void flytta_till(Punkt p) {
     startp.x = p.x;
     startp.y = p.y;
  }

  void flytta(double dx, double dy) {
    startp.x += dx; startp.y += dy;
  }

  Punkt startpunkt() {
    return new Punkt(startp);  // returnera en kopia
  }

  abstract double area();

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

class Punkt {
  double x, y;

  Punkt() {}
  
  Punkt(double xx, double yy) {
    x=xx; y=yy;
  }

  Punkt(Punkt p) {
    x=p.x; y=p.y;
  }

  double avstånd(Punkt p) { 
    // ger avståndet mellan denna punkt och punkten p 
    return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
  }
}




class Cirkel extends Figur {
  private double r;

  Cirkel(double rad, double x, double y) {
    super(x,y);
    r=rad;
  }

  Cirkel(double rad, Punkt mitt) {
    super(mitt);
    r=rad;
  }

  double radie() {
    return r;
  }

  @Override
  double area() {
    return Math.PI*r*r;
  }
}

class Rektangel extends Figur {
  private double b, h;  // bredd och höjd

  // Övre vänstra hörnet ges som starpunkt
  Rektangel(double br, double hö, double x, double y) {
    super(x,y);
    b=br; h=hö;
  }

  Rektangel(double br, double hö, Punkt start) {
    super(start);
    b=br; h=hö;
  }

  double bredd() {
    return b;
  }

  double höjd() {
    return h;
  }
  
  @Override
  double area() {
    return b*h;
  }
}

class Triangel extends Figur {
  private Punkt p2, p3;  // punkterna anges relativt startpunkten

  Triangel(Punkt pa, Punkt pb, Punkt pc) {
    super(pa);
    p2 = new Punkt(pb.x-pa.x, pb.y-pa.y);
    p3 = new Punkt(pc.x-pa.x, pc.y-pa.y);
  }

  Punkt horn(int i) {
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
  double area()
  {
    double a = startp.avstånd(p2), b = startp.avstånd(p3), c = p2.avstånd(p3);
    // a, b och c är sidornas längder
    double s = (a+b+c)/2;
    return Math.sqrt(s*(s-a)*(s-b)*(s-c));  // Herons formel
  }
}



