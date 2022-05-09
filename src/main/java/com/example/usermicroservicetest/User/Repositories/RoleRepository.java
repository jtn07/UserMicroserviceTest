package com.example.usermicroservicetest.User.Repositories;

import com.example.usermicroservicetest.User.Models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

}
