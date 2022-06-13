package org.acme;

public class GreetingDto {
  public String name;

  public GreetingDto() {}

  public GreetingDto(final String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
