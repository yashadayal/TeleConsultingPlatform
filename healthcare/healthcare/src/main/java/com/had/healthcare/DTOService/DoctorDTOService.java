package com.had.healthcare.DTOService;

import com.had.healthcare.DTO.PatientDTO;

public interface DoctorDTOService {

    PatientDTO getPatientById(Integer patientID);
}
