package com.example.usermicroservicetest.User.Services;

import com.example.usermicroservicetest.User.Models.Role;
import com.example.usermicroservicetest.User.Models.UserDto;
import com.example.usermicroservicetest.User.Models.UserEntity;
import com.example.usermicroservicetest.User.Repositories.RoleRepository;
import com.example.usermicroservicetest.User.Repositories.UserEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private RoleRepository roleRepository;
    @Autowired
    private UserEntityRepository userEntityRepository;

    @Override
    public String addRole(String name) {
        try{
            roleRepository.save(new Role(name));
            return "Role saved successfully";
        }
        catch (Exception e){
            throw new RuntimeException("Cannot create role "+name);
        }
    }

    @Override
    public UserDto getUserDetails(String email) {
        return getUserDetailsPrivate(email);
    }

    private UserDto getUserDetailsPrivate(String email){
        try{
            UserEntity userEntity = userEntityRepository.getUserEntityByEmail(email);
            if(userEntity==null)
                throw new UsernameNotFoundException("No such user");
            UserDto userDto=new UserDto();
            userDto.setEmail(userEntity.getEmail());
            userDto.setFirstName(userEntity.getFirstName());
            userDto.setLastName(userEntity.getLastName());
            return userDto;
        }
        catch(Exception e){
            throw new UsernameNotFoundException("No such user");
        }
    }
}
