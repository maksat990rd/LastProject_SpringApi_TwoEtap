package com.example.lastproject_springapi_twoetap.dto.requests;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class CourseRequest {

    private String courseName;
    private int courseDuration;
    private String image;
    private String description;
    private LocalDate dateOfStart;
    private Long companyId;

}
