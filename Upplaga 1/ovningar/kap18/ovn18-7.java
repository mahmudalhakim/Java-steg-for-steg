  public Object avl�s(int index) { 
    if (index < 0 || index >= storlek) 
      throw new IndexOutOfBoundsException();
    else {
      ListElement p = f�rsta;   
      for (int i = 0; i < index; i++)
        p = p.n�sta;
      return p.elem;
    }
  }  

