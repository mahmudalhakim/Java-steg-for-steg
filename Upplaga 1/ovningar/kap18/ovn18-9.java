  public void l�ggIn(int index, Object nyttElem) { 
    if (index < 0 || index > storlek) 
      throw new IndexOutOfBoundsException();
    else {
      DListElement p = start.n�sta;   
      for (int i = 0; i < index; i++)
        p = p.n�sta;
      // L�gg in det nya elementet f�re p
      DListElement ny = new DListElement();
      ny.elem = nyttElem;
      ny.n�sta = p; 
      ny.f�rra = p.f�rra;
      p.f�rra.n�sta = ny;
      p.f�rra = ny;
      storlek++;
    }
  }
