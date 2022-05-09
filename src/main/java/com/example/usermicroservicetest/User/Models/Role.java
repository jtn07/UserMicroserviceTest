package com.example.usermicroservicetest.User.Models;


import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Table
@Data
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String roleName;
    public Role (String roleName){
        this.roleName=roleName;
    }

    public Role() {

    }

    @Override
    public String getAuthority() {
        return this.getRoleName();
    }
}
