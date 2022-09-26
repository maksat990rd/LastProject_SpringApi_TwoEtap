package com.example.lastproject_springapi_twoetap.dto.requests;


import com.example.lastproject_springapi_twoetap.enums.Study;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserRegisterRequest {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int age;
    private String email;
    private Study studyFormat;
    private String password;


}
