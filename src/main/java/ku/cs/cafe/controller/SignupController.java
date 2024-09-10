package ku.cs.cafe.controller;

import jakarta.validation.Valid;
import ku.cs.cafe.request.SignupRequest;
import ku.cs.cafe.service.SignupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class SignupController {

    @Autowired
    private SignupService service;

    @GetMapping("/signup")
    public String getSignupPage(Model model) {
        model.addAttribute("signupRequest", new SignupRequest());
        return "signup";
    }

    @PostMapping("/signup")
    public String signup(@Valid SignupRequest user, BindingResult result, Model model) {

        if (result.hasErrors()) {
            return "signup";
        }

        if (service.isUsernameAvailable(user.getUsername())) {
            service.createUser(user);
            model.addAttribute("signupSuccess", true);
        } else {
            model.addAttribute("signupError", "Username not available");
        }

        model.addAttribute("signupRequest", new SignupRequest());
        return "signup";
    }
}
