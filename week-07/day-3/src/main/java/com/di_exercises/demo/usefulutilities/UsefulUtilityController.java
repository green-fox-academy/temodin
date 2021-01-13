package com.di_exercises.demo.usefulutilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilityController {
    UtilityService utilityService;

    @Autowired
    public UsefulUtilityController (UtilityService utilityService) {
        this.utilityService = utilityService;
    }

@GetMapping ("/useful")
    public String useful () {

        return "useful";
    }

    @GetMapping ("/useful/colored")
    public String colored (Model model) {
        model.addAttribute("randomColor", utilityService.randomColor());
        return "colored";
    }

    @GetMapping ("/useful/email")
    public String validator (@RequestParam String email, Model model) {
        model.addAttribute("validationText",utilityService.validateEmail(email).get(0));
        model.addAttribute("validationColor",utilityService.validateEmail(email).get(1));
        return "email";
    }

    @PostMapping("/useful/encoded")
    public String encoder (String textToEncode, Integer encodingParam, Model model) {
        model.addAttribute("codedText", utilityService.caesar(textToEncode,encodingParam));
        return "encoded";
    }

    @PostMapping("/useful/decoded")
    public String decoder (String textToDecode, Model model) {
        model.addAttribute("decodedTextList", utilityService.caesarDecode(textToDecode));
    return "decoded";
    }






}
