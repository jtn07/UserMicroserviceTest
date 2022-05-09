package com.example.usermicroservicetest.User.Repositories;

import com.example.usermicroservicetest.User.Models.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntityRepository extends JpaRepository<UserEntity,Long> {
    public UserEntity getUserEntityByEmail(String email);
}
