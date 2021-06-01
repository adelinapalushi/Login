package com.LoginApp.repository;

import com.LoginApp.models.ERole;
import com.LoginApp.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface RoleRepository extends MongoRepository<Role, String> {
    Optional<Role> findByName(ERole name);
}
