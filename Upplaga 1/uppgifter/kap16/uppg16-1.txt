// Filen A.java
public class A {
  int i;
}


// Filen B.java
public class B {
  A a = new A();    // går bra: A och B ligger i samma paket
}


// Filen C.java
public class C {
  public static void main(String[] arg) {
    A a = new A();      // kompileringsfel: A ligger i ett annat paket
    B b = new B();      // kompileringsfel: B ligger i ett annat paket
  }
}


