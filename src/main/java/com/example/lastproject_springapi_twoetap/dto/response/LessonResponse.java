package com.example.lastproject_springapi_twoetap.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class LessonResponse {
    private Long id;
    private String lessonName;
    private String courseName;
}
