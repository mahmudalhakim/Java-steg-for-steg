double geosum(double a, double k, int n) {
  double sum = 0;
  for (int i = 1; i <=n; i++) {
    sum = sum + a;
    a = k * a;
  }
  return sum;
}