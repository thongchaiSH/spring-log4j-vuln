package com.xclude.log4jvuln;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
  private static final Logger LOGGER = LogManager.getLogger(TestController.class);

  @GetMapping("/vuln")
  public String test(@RequestParam("userInput") String userInput){
      LOGGER.info("User Input {}",userInput);
      return "{}";
  }
}
