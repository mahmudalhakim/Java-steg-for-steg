// Filen Datum.java

public class Datum {
  int år;
  int mån;
  int dag;

  public String toString() {
    return String.format("%4d-%02d-%02d", år, mån, dag);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null || obj.getClass() != getClass())
	  return false;
	else {
       Datum d = (Datum) obj;
       return år == d.år && mån == d.mån && dag == d.dag;
    }
  }

}

