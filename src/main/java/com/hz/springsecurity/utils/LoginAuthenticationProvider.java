package com.hz.springsecurity.utils;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.stereotype.Component;

import java.util.Collection;
@Component
public class LoginAuthenticationProvider implements AuthenticationProvider {
    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String userName = (String) authentication.getPrincipal(); //拿到username
        String password = (String) authentication.getCredentials(); //拿到password
        System.out.println("userName========" + userName);
        System.out.println("password========" + password);
        return null;
}

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }
}


