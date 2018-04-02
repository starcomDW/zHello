package one.basic;

import one.basic.domain.Locus;

// b4 change ws
public class PCR extends Experiment {

	private Locus locus;

	// master change ws
	public PCR(String name) {
		super(name);
	}

	public Locus getLocus() {
		return locus;
	}

	public void setLocus(Locus locus) {
		this.locus = locus;
	}

  @Override
  public String toString() {
    return "PCR [locus=" + locus + ", getName()=" + getName() + "]";
  }

}
