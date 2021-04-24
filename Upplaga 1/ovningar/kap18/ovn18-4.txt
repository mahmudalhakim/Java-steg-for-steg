  public void taBortSista() { 
    if (storlek > 0) 
      storlek--;
    else
      throw new IndexOutOfBoundsException();
  }
