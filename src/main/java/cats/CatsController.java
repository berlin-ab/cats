package cats;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CatsController {

    @Autowired
    GreetingRepository repository;

    @RequestMapping("/greetings")
    public String greetings(Model model) {
        System.out.println("iooiioioppoiiopiop");
        model.addAttribute("messages", repository.findAll());
        return "greetings";
    }

    @RequestMapping("/testing")
    public String testing() {
        return "testing";
    }

    @RequestMapping("/createGreeting")
    public String createGreeting() {
        repository.save(new Greeting("meow"));
        return "redirect:/greetings";
    }

}
