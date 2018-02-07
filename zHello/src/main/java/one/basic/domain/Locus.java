package one.basic.domain;

public class Locus {

  private final String name;

  private String description;

  public Locus(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
