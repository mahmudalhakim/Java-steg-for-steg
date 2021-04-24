  public void taBortFörsta() { 
    if (första != null)
      första = första.nästa;
    else
      throw new IndexOutOfBoundsException();
  }      

