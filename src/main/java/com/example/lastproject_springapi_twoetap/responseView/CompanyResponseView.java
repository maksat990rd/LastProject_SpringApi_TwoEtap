package com.example.lastproject_springapi_twoetap.responseView;


import com.example.lastproject_springapi_twoetap.dto.response.CompanyResponse;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CompanyResponseView {
    private List<CompanyResponse> companyResponses;
    private int currentPage;
    private int totalPage;

}
