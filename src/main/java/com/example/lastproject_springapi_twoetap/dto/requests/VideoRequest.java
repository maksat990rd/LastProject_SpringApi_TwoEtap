package com.example.lastproject_springapi_twoetap.dto.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VideoRequest {
    private String videoName;
    private String link;
    private Long lessonId;
}
