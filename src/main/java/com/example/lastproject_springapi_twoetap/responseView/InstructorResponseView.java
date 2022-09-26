package com.example.lastproject_springapi_twoetap.responseView;

import com.example.lastproject_springapi_twoetap.dto.response.InstructorResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class InstructorResponseView {
    List<InstructorResponse> instructorResponses;
    private int currentPage;
    private int totalPage;

}
