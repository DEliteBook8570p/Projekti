package com.timeframe.JustPlaying;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TerminiController {
	@GetMapping("/termini")
    public String greetingForm(Model model) {
        model.addAttribute("termini", new Termini());
        return "termini";
    }

    @PostMapping("/termini")
    public String greetingSubmit(@ModelAttribute Termini termini) {
        return "terminiResult";
    }
}
