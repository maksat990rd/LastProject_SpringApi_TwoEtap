package com.example.lastproject_springapi_twoetap.repository;


import com.example.lastproject_springapi_twoetap.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findByEmail(String email);


//    User findUserByAuthoritiesEAndEmail(String email);

//    @Query("email = email !")

}
