package com.clinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.processing.Generated;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("Clinic/v1/patients")
public class ClinicAppointmentApiApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(ClinicAppointmentApiApplication.class, args);
	}

	@GetMapping
	public List<Patient> getPatients()
	{
		return List.of();
	}

}
