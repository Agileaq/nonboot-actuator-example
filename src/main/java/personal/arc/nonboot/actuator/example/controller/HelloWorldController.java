package personal.arc.nonboot.actuator.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import personal.arc.nonboot.actuator.example.bean.Person;

/**
 * Created by Arc on 17/8/2016.
 */
@RestController
@RequestMapping("say")
public class HelloWorldController {
    @RequestMapping("hello")
    public String sayHello() {
        return "Hello world!";
    }

    @RequestMapping("person")
    public Person getPerson() {
        return new Person().setName("name").setPassword("pwd");
    }

}
