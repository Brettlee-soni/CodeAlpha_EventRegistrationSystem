package com.codealpha.eventregistration.controller;

import com.codealpha.eventregistration.model.Registration;
import com.codealpha.eventregistration.service.RegistrationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    @PostMapping
    public Registration register(@RequestBody Registration registration) {
        return registrationService.saveRegistration(registration);
    }

    @GetMapping
    public List<Registration> getAllRegistrations() {
        return registrationService.getAllRegistrations();
    }

    @DeleteMapping("/{id}")
    public String deleteRegistration(@PathVariable Long id) {
        registrationService.deleteRegistration(id);
        return "Registration Cancelled";
    }
}