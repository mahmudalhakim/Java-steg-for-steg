class Kon {
  double h;
  double r;

  double volym() {
    return Math.PI * r * r * h / 3;
  }
}
var k = new Kon()
k.h = 2
k.r = 3
k.volym()