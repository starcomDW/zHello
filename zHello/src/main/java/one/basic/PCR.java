package one.basic;

import one.basic.domain.Locus;

// just tof check origin
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
