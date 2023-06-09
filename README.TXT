# --------------------------------------------------- Clinic Appointment Reservation  ---------------------------------------

Clinic Appointment Reservation API is a RESTful web service that allows users to track and manage appointments made at a clinic. 
There are severalendpoints which enable for creating, retrieving, updating, and deleting appointments. 
Here you will find its functionality


The base URL for accessing the Task Manager API is: localhost:8080/api/patients


1. The first feature retrieves the data about all patient that made the reservation from the URL:api/patients
Uses GET Method
RequestParams: None
Response: gives us a JSON array with the details of all of the appointments, each patient object has the following:

patient (
        appointed_date date,         ---- date and time of the reservation
        id integer not null, 	     ---- this is the unique identifier or primary key(PK) of the table
        description varchar(255),    ---- here is a short description of the reason why the patient is reserving
        doctor varchar(255),	     ---- the doctor that is being reserved at
        first_name varchar(255),     ---- First name of the patient
        last_name varchar(255),	     ---- Last name of the patient
        primary key (id)	     ---- specifying that this is the primary key
    )

You can also get a specific reservation with the URL:api/patients/{id}
Responds with the JSON Object that contains the information about the reservation



2. The second features adds a new reservation that the patient has made with the URL:api/patients
Uses POST Method
RequestParams: Requests a JSON object to create the reservation for the appropriate fields:

first_name:
last_name:
description:
doctor:
appointed_time:




3. Third feature DELETE which enables to delete a selected task with the URL:api/patients/{id}
Uses DELETE Method
It needs the path parameter:
patientId (Integer)





4.Edits a task with URL:api/patients/{id}
Uses PUT Method
Updates the reservation with the following:

first_name:
last_name:
description:
doctor:
appointed_time:

