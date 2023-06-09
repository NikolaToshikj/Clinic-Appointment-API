package com.clinic;

import java.util.Objects;


public class Patient
{
    private Integer id;
    private String firstName;
    private String lastName;

    public Patient(Integer id,String firstName,String lastName)
    {
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
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

    public void setLastName()
    {
        this.lastName=lastName;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(id,patient.id) && Objects.equals(firstName, patient.firstName) && Objects.equals(lastName, patient.lastName);
    }

    @Override
    public int hashCode ()
    {
       return Objects.hash(id,firstName,lastName);
    }

    @Override
    public String toString()
    {
        return "Patient{" +
                "id=" + id +
                ", firstName='" + firstName + '\''+
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
