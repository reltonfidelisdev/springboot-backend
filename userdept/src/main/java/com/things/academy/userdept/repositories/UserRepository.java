package com.things.academy.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.things.academy.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
