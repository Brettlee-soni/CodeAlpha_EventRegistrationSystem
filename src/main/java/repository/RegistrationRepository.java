package com.codealpha.eventregistration.repository;

import com.codealpha.eventregistration.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}