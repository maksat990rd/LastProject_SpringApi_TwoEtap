package com.example.lastproject_springapi_twoetap.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CompanyResponse {
    private Long id;
    private String companyName;
    private String locatedCountry;
//    private Course courses;
}
