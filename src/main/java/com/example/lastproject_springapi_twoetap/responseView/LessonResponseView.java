package com.example.lastproject_springapi_twoetap.responseView;

import com.example.lastproject_springapi_twoetap.dto.response.LessonResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class LessonResponseView {

    List<LessonResponse> lessonResponses;
}
