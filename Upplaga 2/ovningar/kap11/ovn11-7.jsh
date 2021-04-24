double[] v = {1.0, 2.5, 0.4, 6.3, 7.9};
String[] z = {"hej", "hi", "hola", "ciao"};
var v2 = Arrays.copyOf(v, 3);
var v3 = Arrays.copyOf(v, 8);
var v4 = Arrays.copyOfRange(v, 2, 4);
var z2 = Arrays.copyOf(z, 3);
var z3 = Arrays.copyOfRange(z, 1, 5);