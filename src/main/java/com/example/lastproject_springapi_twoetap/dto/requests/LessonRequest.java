package com.example.lastproject_springapi_twoetap.dto.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LessonRequest {
    private String lessonName;
    private Long courseId;
}
