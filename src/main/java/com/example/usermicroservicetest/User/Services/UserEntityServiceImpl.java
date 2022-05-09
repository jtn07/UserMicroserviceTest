package com.example.usermicroservicetest.User.Services;

import com.example.usermicroservicetest.User.Models.Role;
import com.example.usermicroservicetest.User.Models.User;
import com.example.usermicroservicetest.User.Models.UserEntity;
import com.example.usermicroservicetest.User.Repositories.RoleRepository;
import com.example.usermicroservicetest.User.Repositories.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserEntityServiceImpl implements UserEntityService {

    @Autowired
    UserEntityRepository userEntityRepository;

    @Autowired
    RoleRepository roleRepository;

    @Override
    public String addUser(User user) throws Exception {
        UserEntity userEntity = new UserEntity(user.getFirstName(), user.getLastName(), user.getEmail(),user.getPassword());
        List<Role> authorities =userEntity.getRoles();
        authorities.add(roleRepository.getById(1L));
        try{
            userEntityRepository.save(userEntity);
            return "User added Successfully";
        }
         catch (Exception e){
            throw new Exception("User cannot be added");
         }
    }
}
