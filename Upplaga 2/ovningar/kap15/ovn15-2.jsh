class Cykel {
  String fabrikat;
  int antalV�xlar;
  boolean harElmotor;
}
var c = new Cykel[2];
for (int i=0; i<c.length; i++)
  c[i] = new Cykel();
c[0].fabrikat = "EcoRide"
c[0].antalV�xlar = 8
c[0].harElmotor = true
c[1].fabrikat = "Skeppshult"
c[2].antalV�xlar = 5
c[1].antalV�xlar = 5
c[1].harElmotor = false
for (int i = 0; i<c.length; i++)
  System.out.println(c[i].fabrikat + " " + c[i].antalV�xlar + " " + c[i].harElmotor);