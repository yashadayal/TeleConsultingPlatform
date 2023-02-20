package com.had.healthcare.Controller;


import com.had.healthcare.DTO.PatientDTO;
import com.had.healthcare.Service.DoctorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Doctor/Login")
public class DoctorController {

    private DoctorService doctorService;

    @GetMapping("/{patientID}")
    public ResponseEntity<PatientDTO> getPatientById(@PathVariable Integer patientID){
        return ResponseEntity.ok(this.doctorService.getPatientById(patientID));
    }

}
