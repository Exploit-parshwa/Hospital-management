-- SQL script to create the database schema for the Hospital Management System

CREATE DATABASE IF NOT EXISTS hms;

USE hms;

-- Table for storing doctor records
CREATE TABLE IF NOT EXISTS doctor_record (
    doctor_id VARCHAR(50) PRIMARY KEY,
    doctor_name VARCHAR(100) NOT NULL,
    specialization VARCHAR(100) NOT NULL
);

-- Additional tables can be created here as needed
-- Example: Table for patient records
CREATE TABLE IF NOT EXISTS patient_record (
    patient_id VARCHAR(50) PRIMARY KEY,
    patient_name VARCHAR(100) NOT NULL,
    doctor_id VARCHAR(50),
    FOREIGN KEY (doctor_id) REFERENCES doctor_record(doctor_id)
);

-- Example: Table for appointment records
CREATE TABLE IF NOT EXISTS appointment_record (
    appointment_id INT AUTO_INCREMENT PRIMARY KEY,
    patient_id VARCHAR(50),
    doctor_id VARCHAR(50),
    appointment_date DATETIME,
    FOREIGN KEY (patient_id) REFERENCES patient_record(patient_id),
    FOREIGN KEY (doctor_id) REFERENCES doctor_record(doctor_id)
);

-- Insert initial data if necessary
INSERT INTO doctor_record (doctor_id, doctor_name, specialization) VALUES
('D001', 'Dr. John Smith', 'Cardiology'),
('D002', 'Dr. Jane Doe', 'Neurology');