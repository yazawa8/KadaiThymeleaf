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

    @GetMapping("/output")
    public String postOutputGet(@RequestParam(name = "input", required = false) String input, @RequestParam(name = "previous", required = false) String previous, Model model) {
        if (previous != null && !previous.isEmpty()) {
            model.addAttribute("previousMessage", "前回入力された値は「" + previous + "」でした。");
        }
        model.addAttribute("input", input);
        model.addAttribute("fixedText", fixedText);
        model.addAttribute("outputText", outputText);
        return "output";
    }

    @PostMapping("/output")
    public String postOutputPost(@RequestParam(name = "input", required = false) String input, @RequestParam(name = "previous", required = false) String previous, Model model) {
        if (previous != null && !previous.isEmpty()) {
            model.addAttribute("previousMessage", "入力された値は「" + previous + "」です。");
        }
        model.addAttribute("input", input);
        model.addAttribute("fixedText", fixedText);
        model.addAttribute("outputText", outputText);
        return "output";
    }
}
