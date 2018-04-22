package in.co.wizbee.spring.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {
    @RequestMapping("/login")
    public String message(){
        return "Spring Login controller is working!";
    }
}
