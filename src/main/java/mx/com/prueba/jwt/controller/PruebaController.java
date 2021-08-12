package mx.com.prueba.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class PruebaController {
    
    
    @GetMapping("/hello")
    public String hello(@RequestParam(value="name",defaultValue = "El santa Cruz!")String name) {

        return String.format("Hola %s", name);
    }

    
}
