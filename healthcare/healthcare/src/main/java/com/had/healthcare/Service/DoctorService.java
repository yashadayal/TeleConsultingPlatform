package com.had.healthcare.Service;

import com.had.healthcare.Bean.Patient;
import com.had.healthcare.DTO.PatientDTO;
import com.had.healthcare.DTOService.DoctorDTOService;
import com.had.healthcare.Exception.ResourceNotFoundException;
import com.had.healthcare.Repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorService implements DoctorDTOService {

    //Autowired because function of Service layer is using data of other layer so for object creation new keyword is
    //not required it will autowire it.
    @Autowired
    private PatientRepo patientRepo;

    @Override
    public PatientDTO getPatientById(Integer patientID) {

        Patient patient = this.patientRepo.findById(patientID).orElseThrow(()-> new ResourceNotFoundException("Patient","id",patientID));
        return this.patientToDTO(patient);
    }

    public PatientDTO patientToDTO(Patient patient) {

        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setPatientID(patient.getPatientID());
        patientDTO.setGender(patient.getGender());
        patientDTO.setLast_name(patient.getLast_name());
        patientDTO.setFirst_name(patient.getFirst_name());
        patientDTO.setEmailID(patient.getEmailID());
        patientDTO.setPhoneNum(patient.getPhoneNum());
        patientDTO.setDateofBirth(patient.getDateOfBirth());
        return patientDTO;
    }
}
