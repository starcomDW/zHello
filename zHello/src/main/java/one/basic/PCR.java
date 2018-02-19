package one.basic;

import one.basic.domain.Locus;

// comment for a commit that will be reverted
public class PCR extends Experiment {

	private Locus locus;

	public PCR(String name) {
		super(name);
	}

	public Locus getLocus() {
		return locus;
	}

	public void setLocus(Locus locus) {
		this.locus = locus;
	}

}
