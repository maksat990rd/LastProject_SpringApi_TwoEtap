package com.example.lastproject_springapi_twoetap.dto.response;

import com.example.lastproject_springapi_twoetap.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserRegisterResponse {
    private String firstName;
    private String lastName;
    private String email;
    private String token;
    private Role role;
}
