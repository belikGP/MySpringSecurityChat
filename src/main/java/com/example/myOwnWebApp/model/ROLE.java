package com.example.myOwnWebApp.model;

import org.springframework.security.core.GrantedAuthority;

public enum ROLE implements GrantedAuthority {
    USER, ADMIN, GUEST;
    @Override
    public String getAuthority() {
        return null;
    }
}
