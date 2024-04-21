package com.techacademy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OutputController {

    @Value("${fixed.text}")
    private String fixedText;

    @Value("${output.text}")
    private String outputText;

    @Value("${return.text}")
    private String returnText;

    @GetMapping("/output")
    public String getOutput(@RequestParam(name = "input", required = false) String input, @RequestParam(name = "previous", required = false) String previous, Model model) {

        model.addAttribute("input", input);
        model.addAttribute("fixedText", fixedText);
        model.addAttribute("outputText", outputText);
        model.addAttribute("returnText", returnText);
        return "output";
    }

    @PostMapping("/output")
    public String postOutput(@RequestParam(name = "input", required = false) String input, @RequestParam(name = "previous", required = false) String previous, Model model) {

        model.addAttribute("input", input);
        model.addAttribute("fixedText", fixedText);
        model.addAttribute("outputText", outputText);
        model.addAttribute("returnText", returnText);
        return "output";
    }
}
