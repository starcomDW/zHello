package one.basic;

import one.basic.domain.Locus;

// make this change on b1, should merge in
// and keep previous merged conflict in place
// change on master
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
