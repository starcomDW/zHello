package one.basic.domain;

public enum Base {

  A, T, G, C, N;
  
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
    
    if (this == N) {
        return N;
     }
    
    throw new IllegalStateException("missing case: " + this);
  }
  
  public Base getBase(String baseAsString) {
    return valueOf(baseAsString.toUpperCase());
  }
  
  public Base getBase(char baseAsChar) {
    return valueOf(Character.toString(baseAsChar));
  }
}
