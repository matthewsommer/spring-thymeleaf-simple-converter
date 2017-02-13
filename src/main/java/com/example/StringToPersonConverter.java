package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.example.model.Person;

@Component
public class StringToPersonConverter implements Converter<String, Person> {
  
  @Autowired
  public StringToPersonConverter() { }

  @Override
  public Person convert(String id) {
    if(id == "1") {
      Person person = new Person(1, "John Smith");
      return person;
    }
    return null;
  }
}