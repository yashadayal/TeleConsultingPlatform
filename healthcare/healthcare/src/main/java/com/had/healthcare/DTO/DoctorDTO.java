package com.had.healthcare.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//Not using Bean class for dataTransfer to APIs, it is only used for creating table in database
@NoArgsConstructor
@Getter
@Setter
public class DoctorDTO {

    Integer doctorID;
    String name;
    String phoneNum;
    String emailID;
    String specialization;

}
