package com.clinic.enteties;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Patient
{
    @Id
    @SequenceGenerator(
            name = "patient_id_sequence",
            sequenceName = "patient_id_sequence",
            allocationSize=1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "patient_id_sequence"
    )
    private Integer id;
    private String firstName;
    private String lastName;
    private String description;
    private String doctor;
    private String email;
    private LocalDate appointedDate;

    public Patient(Integer id,String firstName,String lastName, String description,String doctor, String email,LocalDate appointedDate)
    {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.description=description;
        this.appointedDate=appointedDate;
        this.doctor=doctor;
        this.email=email;
    }

    public Patient(){
    }

    public Integer getId()
    {
        return id;
    }
    public void setId(Integer id)
    {
        this.id=id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String lastName)
    {
        this.description=description;
    }

    public String getDoctor(){return doctor;}
    public void  setDoctor(String doctor){this.doctor=doctor;}

    public LocalDate getAppointedDate() {return appointedDate;}

    public void setAppointedDate(LocalDate appointedDate){this.appointedDate=appointedDate;}

    public String getEmail(){return email;}

    public void setEmail(String email){this.email=email;}

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(id,patient.id) && Objects.equals(firstName, patient.firstName) && Objects.equals(lastName, patient.lastName) && Objects.equals(description,patient.description) && Objects.equals(appointedDate, patient.appointedDate) && Objects.equals(doctor, patient.doctor) && Objects.equals(email,patient.email);
    }

    @Override
    public int hashCode ()
    {
       return Objects.hash(id,firstName,lastName,description,doctor,email,appointedDate);
    }

    @Override
    public String toString()
    {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\''+
                ", lastName='" + lastName + '\'' +
                ", description='" + description + '\''+
                ", doctor='" + doctor +'\'' +
                ", email='" + email + '\'' +
                ", appointedDate='" + appointedDate + '\'' +
                '}';
    }
}
