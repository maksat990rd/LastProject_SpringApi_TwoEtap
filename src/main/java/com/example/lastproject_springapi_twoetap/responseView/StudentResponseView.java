package com.example.lastproject_springapi_twoetap.responseView;

import com.example.lastproject_springapi_twoetap.dto.response.StudentResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class StudentResponseView {
    List<StudentResponse> studentResponses;
    private int currentPage;
    private int totalPage;
}
