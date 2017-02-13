package com.example;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.model.Comment;
import com.example.model.Person;

@Controller
public class HomeWebController {
  
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String getHome(final HttpServletRequest request, final Map<String, Object> model, @ModelAttribute(value = "comment") Comment comment) {
    model.put("personObject", new Person(1, "John Smith"));
    return "Home";
  }
  
  @RequestMapping(value = "/", method = RequestMethod.POST)
  public String postHome(final HttpServletRequest request, final Map<String, Object> model, @ModelAttribute(value = "comment") Comment comment) {
    model.put("commentBody", comment.getBody());
    model.put("person", comment.getPerson());
    return "Home";
  }

}