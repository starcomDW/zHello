package one.basic;

import java.util.ArrayList;
import java.util.Collection;

import one.basic.domain.result.Genotype;

public class Genotyping extends Experiment {

  private PCR pcrSource;

  private final Collection<Genotype> results = new ArrayList<>();

  public Genotyping(String name) {
    super(name);
  }
  
  public Genotyping(PCR source, String name) {
    super(name);
    pcrSource = source;
  }

  public Collection<Genotype> getResults() {
    return results;
  }

  public PCR getPcrSource() {
    return pcrSource;
  }

  public void setPcrSource(PCR pcrSource) {
    this.pcrSource = pcrSource;
  }

  @Override
  public String toString() {
    return "Genotyping [pcrSource=" + pcrSource + ", results=" + results + ", toString()=" + super.toString() + "]";
  }

}
