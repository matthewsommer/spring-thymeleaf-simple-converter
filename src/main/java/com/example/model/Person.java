package com.example.model;

public class Person {
  
  private long id;
  private String name;
  
  public Person(long id, String name) {
    this.id = id;
    this.setName(name);
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  
}