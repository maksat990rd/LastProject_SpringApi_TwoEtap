package com.example.lastproject_springapi_twoetap.dto.response;


import com.example.lastproject_springapi_twoetap.enums.Study;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
//    @Enumerated(EnumType.ORDINAL)
    private Study studyFormat;
    private String companyName;


}
