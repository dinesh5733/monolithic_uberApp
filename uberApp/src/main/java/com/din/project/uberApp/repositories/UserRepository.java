package com.din.project.uberApp.repositories;

import com.din.project.uberApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
