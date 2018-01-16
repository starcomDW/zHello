package one.basic.domain;

public enum Base {

  A, T, G, C;
  
  public Base getComplement() {
    if (this == A) {
      return T;
    }
    
    if (this == T) {
      return A;
    }
    
    if (this == G) {
      return C;
    }
    
    if (this == C) {
      return G;
    }
    
    throw new IllegalStateException("missing case: " + this);
  }
}
