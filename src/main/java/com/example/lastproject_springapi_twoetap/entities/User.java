package com.example.lastproject_springapi_twoetap.entities;

import com.example.lastproject_springapi_twoetap.enums.Role;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor

public class User implements UserDetails {
    @Id
    @SequenceGenerator(name = "user_gen", sequenceName = "user_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String email;
    private String password;

    @CreatedDate
    private LocalDate created;
    private boolean isActive = true;

    @Enumerated(EnumType.STRING)
    private Role role;

    public User( String email, String password, com.example.lastproject_springapi_twoetap.enums.Role role) {
        this.email = email;
        this.password = password;
        this.role = role;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(role);
    }


    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}