package com.clinic.repositories;

import com.clinic.enteties.Patient;
import com.clinic.repositories.PatientRepository;
import com.clinic.ClinicAppointmentApiApplication;

import com.clinic.enteties.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
