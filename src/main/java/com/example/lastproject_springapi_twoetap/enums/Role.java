package com.example.lastproject_springapi_twoetap.enums;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ADMIN,
    STUDENT,
    INSTRUCTOR;

    @Override
    public String getAuthority() {
        return this.name();
    }
}
