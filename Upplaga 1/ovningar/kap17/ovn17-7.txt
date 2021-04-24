// Filen Datum.java

public class Datum implements Comparable<Datum> {
  int år;
  int mån;
  int dag;

  @Override
  public String toString() {
    return String.format("%4d-%02d-%02d", år, mån, dag);
  }

  public int compareTo(Datum d) {
    if (år < d.år || år == d.år && mån < d.mån || år == d.år && mån == d.mån && dag < d.dag)
	  return -1;
	else if (år > d.år || år == d.år && mån > d.mån || år == d.år && mån == d.mån && dag > d.dag)
	  return 1;
	else return 0;
  }
  
}
