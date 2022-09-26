package com.example.lastproject_springapi_twoetap.dto.response;

import com.example.lastproject_springapi_twoetap.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Builder
@AllArgsConstructor

public class UserResponse {
    private Long id;
    private String email;
    private String token;
    private Role role;

}

