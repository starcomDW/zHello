package one.basic;

import java.util.Date;
//b4 change ws, now make a change in t to test checkout
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
    return "Experiment [name=" + name + "]xxx";
  }

}
