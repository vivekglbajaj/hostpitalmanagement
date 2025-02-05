# hostpitalmanagement
Hospital Management System

The Hospital Management System is a simple Java-based program that simulates interactions between doctors, patients, and appointments. It demonstrates concepts of Encapsulation and Object Interaction in Object-Oriented Programming.

Features

Doctor Class

Stores doctor's name and specialization.

Can diagnose patients.

Patient Class

Stores patient’s name and age.

Can receive treatment from a doctor.

Appointment Class

Manages the scheduling of appointments between doctors and patients.

Technologies Used

Java (Object-Oriented Programming)

Classes & Methods

1. Doctor Class

Attributes:

name (String) - Stores the doctor's name.

specialization (String) - Stores the doctor's field.

Methods:

Doctor(String name, String specialization) - Constructor.

void diagnosePatient() - Prints a message when diagnosing a patient.

String getName() - Returns the doctor's name.

2. Patient Class

Attributes:

name (String) - Stores the patient's name.

age (int) - Stores the patient's age.

Methods:

Patient(String name, int age) - Constructor.

void getTreatment(Doctor doctor) - Calls diagnosePatient() method of the doctor.

3. Appointment Class

Attributes:

doctor (Doctor) - Doctor assigned to the appointment.

patient (Patient) - Patient for the appointment.

Methods:

Appointment(Doctor doctor, Patient patient) - Constructor.

