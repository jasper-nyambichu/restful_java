package com.moseti.example;


import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

 @GetMapping("/get")
    public String sayHello(){

        return "This is my first get mapping request";
    }

    @PostMapping("/post")
    public String post(
          @RequestBody  String message
    ){
        return "Request accepted and the message is: "+message;
    }


}
