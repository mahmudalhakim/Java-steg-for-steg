  public Object avläs(int index) { 
    if (index < 0 || index >= storlek) 
      throw new IndexOutOfBoundsException();
    else {
      ListElement p = första;   
      for (int i = 0; i < index; i++)
        p = p.nästa;
      return p.elem;
    }
  }  

