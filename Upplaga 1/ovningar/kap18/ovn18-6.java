  public void taBortF�rsta() { 
    if (f�rsta != null)
      f�rsta = f�rsta.n�sta;
    else
      throw new IndexOutOfBoundsException();
  }      

