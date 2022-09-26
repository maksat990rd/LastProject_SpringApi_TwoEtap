package com.example.lastproject_springapi_twoetap.dto.requests;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRequest {
    private String name;
    private String email;
    private String password;

}
