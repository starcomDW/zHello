package one.basic.domain;

// Include NK??
public enum MHC {
    HLA_A(MHC_CLASS.TYPE_I), HLA_B(MHC_CLASS.TYPE_I), HLA_C(MHC_CLASS.TYPE_I);
  
    private final MHC_CLASS classType;
    
    private MHC(MHC_CLASS type) {
      classType = type;
    }
    
    public MHC_CLASS getClassType() {
      return classType;
    }
}
