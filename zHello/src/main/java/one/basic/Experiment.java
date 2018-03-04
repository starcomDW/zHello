package one.basic;

import java.util.Date;

public class Experiment {

  private String name;
  
  private Date date;

  public Experiment(String name) {
    this.name = name;
  }
  
  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  
  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Experiment [name=" + name + "]";
  }

}
