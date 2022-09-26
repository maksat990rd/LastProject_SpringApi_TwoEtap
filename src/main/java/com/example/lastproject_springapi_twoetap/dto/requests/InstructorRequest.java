package com.example.lastproject_springapi_twoetap.dto.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InstructorRequest {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String specialization;
    private String password;
    private Long companyId;

}
