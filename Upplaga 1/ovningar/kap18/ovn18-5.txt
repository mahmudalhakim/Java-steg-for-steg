  public void läggTill(int index, Object nyttElem) { 
    if (index >= 0 && index <= storlek && storlek < kapacitet) {
      for (int i=storlek; i > index; i--)
        a[i] = a[i-1];
      a[index] = nyttElem;
      storlek++;
    }
    else
      throw new IndexOutOfBoundsException();
  }
