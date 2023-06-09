package com.clinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.annotation.processing.Generated;
import java.util.List;

import com.clinic.PatientRepository;
@SpringBootApplication
@RestController
@RequestMapping("api/v1/patients")
public class ClinicAppointmentApiApplication {

	private final PatientRepository patientRepository;

	public ClinicAppointmentApiApplication(PatientRepository patientRepository)
	{
		this.patientRepository=patientRepository;
	}

	public static void main(String[] args)
	{
		SpringApplication.run(ClinicAppointmentApiApplication.class, args);
	}

	@GetMapping
	public List<Patient> getPatients()
	{
		return patientRepository.findAll();
	}



}
