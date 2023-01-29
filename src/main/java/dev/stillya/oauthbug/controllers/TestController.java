package dev.stillya.oauthbug.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/info")
public class TestController {

  @RequestMapping("/permit")
  public String test() {
    return "permit";
  }

  @RequestMapping("/deny")
  public String test2() {
    return "deny";
  }
}
