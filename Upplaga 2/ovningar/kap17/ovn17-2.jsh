class Fordon {
  int vikt;

  void skrivInfo() {
    System.out.println("Ett fordon med vikten " + vikt);
  }
}
class Cykel extends Fordon {
  String fabrikat;
  int antalV�xlar;
  boolean harElmotor;

  void skrivInfo() {
    System.out.println("En Cykel av fabrikatet " + fabrikat);
  }
  
}
var c = new Cykel();
var f = new Fordon();
c.fabrikat = "EcoRide";
c.antalV�xlar = 8;
c.harElmotor = true;
c.vikt = 25;
f.skrivInfo();
c.skrivInfo();