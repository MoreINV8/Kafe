package ku.cs.cafe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    // use RequestMapping for all method(GET, POST, DELETE, ...) should go using this method
    @RequestMapping("/")
    public String getHomepage(Model model) {
        model.addAttribute("greeting", "Sawaddee");

        // return file html
        return "home";
    }
}
