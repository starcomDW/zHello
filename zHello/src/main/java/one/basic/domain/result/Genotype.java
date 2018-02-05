package one.basic.domain.result;

public class Genotype {

  private String name;
  
  private String category;

  private double confidence;

  public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public double getConfidence() {
    return confidence;
  }

  public void setConfidence(double confidence) {
    this.confidence = confidence;
  }
}
