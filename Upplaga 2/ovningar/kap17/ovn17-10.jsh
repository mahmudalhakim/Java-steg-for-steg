abstract class Fordon {
  int vikt;
  abstract void skrivInfo(); 
}

class Cykel extends Fordon {
  String fabrikat;
  int antalVäxlar;
  boolean harElmotor;
  
  Cykel (int v, String fab, int väx, boolean el) {
    super(v);
    fabrikat = fab;
    antalVäxlar = väx;
    harElmotor = el;
  }

  void skrivInfo() {
    System.out.println("En Cykel av fabrikatet " + fabrikat);
  }
  
}

var f = new Fordon(1000);
var c = new Cykel(15, "Monark", 5, false);