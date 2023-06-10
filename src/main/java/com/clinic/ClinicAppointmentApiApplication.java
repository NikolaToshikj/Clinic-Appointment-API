package com.clinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.annotation.processing.Generated;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.clinic.repositories.PatientRepository;
import com.clinic.enteties.Patient;

@SpringBootApplication
@RestController
@RequestMapping("api/patients")
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

	record NewPatientRequest(
		String firstName,
		String lastName,
		String description,
		String doctor,
		String email,
		LocalDate appointedDate
	){

	}

	@PostMapping
	public void addPatient(@RequestBody NewPatientRequest request)
	{
		Patient patient = new Patient();
		patient.setFirstName(request.firstName());
		patient.setLastName(request.lastName());
		patient.setDescription(request.description());
		patient.setDoctor(request.doctor());
		patient.setEmail(request.email());
		patient.setAppointedDate(request.appointedDate());
		patientRepository.save(patient);
	}

	@DeleteMapping("{patientId}")
	public void deletePatient(@PathVariable("patientId") Integer id)
	{
		patientRepository.deleteById(id);
	}

	@PutMapping("patientId")
	public void updatePatient(@PathVariable("patientId") Integer id,@RequestBody NewPatientRequest request)
	{
		Patient patientUpdate = patientRepository.getById(id);
		patientUpdate.setFirstName(request.firstName());
		patientUpdate.setLastName(request.lastName());
		patientUpdate.setDescription(request.description());
		patientUpdate.setDoctor(request.doctor());
		patientUpdate.setEmail(request.email());
		patientUpdate.setAppointedDate(request.appointedDate());
		patientRepository.save(patientUpdate);
	}


}
