package de.as79dev.babyappaws;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/") 
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
