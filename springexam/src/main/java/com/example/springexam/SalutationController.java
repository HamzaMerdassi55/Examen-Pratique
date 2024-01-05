package com.example.springexam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/salutation")
public class SalutationController {

    @GetMapping
    public String getSalutation() {
        return "Bonjour Master DevOps II";
    }
}
