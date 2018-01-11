package one.basic;

import java.util.*;

import one.basic.domain.result.Genotype;

public class Genotyping extends Experiment {
  
  private final Collection<Genotype> results = new ArrayList<>();

  public Genotyping(String name) {
    super(name);
  }
  
  public Collection<Genotype> getResults() {
    return results;
  }

}
