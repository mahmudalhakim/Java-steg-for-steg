// �ndra i klasserna A och B s� att de hamnar i paketet ABpak
// D�p om mappen de ligger i s� att den ocks� heter ABpak

// Filen A.java
package ABpak;

public class A {
  int i;
}

// Filen B.java
package ABpak;

public class B {
  A a = new A();
}


// Skapa sedan en jar-fil som inneh�ller klasserna A och B.
// Kopiera jar-filen till det r�tta st�llet

// �ndra i klassen C s� att den importerar paketet ABpak:

// Filen C.java
import ABpak.*;

public class C {
  public static void main(String[] arg) {
    A a = new A();
    B b = new B();
  }
}


