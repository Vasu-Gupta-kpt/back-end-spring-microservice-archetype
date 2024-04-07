package com.company.microservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public ResponseEntity<String> get() {
        return ResponseEntity.ok("Hello from Railway + Spring!");
    }

    @GetMapping("/sensorData")
    public void data(@RequestParam("flex1") int flex1 ,@RequestParam("flex2") int flex2, @RequestParam("flex3") int flex3, @RequestParam("flex4") int flex4, @RequestParam("flex5") int flex5 ) {
    	System.out.println(flex1+" "+flex2+" "+flex3+" "+flex4+" "+flex5+" ");
    }
}
