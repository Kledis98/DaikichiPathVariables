package com.codingdojo.daikichipath.variables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class Exercise {
    @RequestMapping("/travel/{place}")
    public String location(@PathVariable("place") String place){
    return "Congratulations, you will soon travel to" + place;
    }

    @RequestMapping("/lotto/{number}")
    public String result(@PathVariable("number") int number){
        if (number % 2 == 0){
            return "You will take a grand journey to the near future";
        }
        else{
            return "You have enjoyed the fruits";
        }
    }
}
