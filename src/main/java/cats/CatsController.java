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
        model.addAttribute("messages", repository.findAll());
        return "greetings";
    }

    @RequestMapping("/testing")
    public String testingFoo() {
        return "testing";
    }

    @RequestMapping("/createGreeting")
    public String createGreeting() {
        repository.save(new Greeting("bat"));
        return "redirect:/greetings";
    }

}
