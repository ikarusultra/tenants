package de.ikarus.devops.tenants.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Niclas Wolff (n.wolff@micromata.de)
 */


@RestController
public class HelloController {
  @GetMapping("/greeting")
  public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name) {
    return "Hello " + name + "from tenants";
  }
}
