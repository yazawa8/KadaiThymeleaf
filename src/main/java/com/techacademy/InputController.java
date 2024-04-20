package com.techacademy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InputController {

    @Value("${fixed.text}")
    private String fixedText;

    @Value("${input.text}")
    private String inputText;

    @Value("${fill.text}")
    private String fillText;

    @GetMapping("/input")
    public String getInput(Model model) {
        model.addAttribute("fixedText", fixedText);
        model.addAttribute("inputText", inputText);
        model.addAttribute("fillText", fillText);
        return "input";
    }

}
