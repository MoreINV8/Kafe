package ku.cs.cafe.controller;

import ku.cs.cafe.entity.Member;
import ku.cs.cafe.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class SignupController {

    @Autowired
    private SignupService service;

    @GetMapping("/signup")
    public String getSignupPage() {
        System.out.println("Get");
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(@ModelAttribute Member user, Model model) {
        System.out.println("Post");
        if (service.isUsernameAvailable(user.getUsername())) {
            service.createUser(user);
            model.addAttribute("signupSuccess", true);
        } else {
            model.addAttribute("signupError", "Username not available");
        }

        return "signup";
    }
}
