package com.meac.cousespringboot.repositories;

import com.meac.cousespringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
