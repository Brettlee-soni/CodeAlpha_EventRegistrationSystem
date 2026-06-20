package com.codealpha.eventregistration.service;

import com.codealpha.eventregistration.model.Registration;
import com.codealpha.eventregistration.repository.RegistrationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    public Registration saveRegistration(Registration registration) {
        return registrationRepository.save(registration);
    }

    public List<Registration> getAllRegistrations() {
        return registrationRepository.findAll();
    }

    public void deleteRegistration(Long id) {
        registrationRepository.deleteById(id);
    }
}