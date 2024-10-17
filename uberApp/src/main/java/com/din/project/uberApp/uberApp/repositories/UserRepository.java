package com.din.project.uberApp.uberApp.repositories;

import com.din.project.uberApp.uberApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
