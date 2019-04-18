package com.messager.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.Set;

@Service
public class UserDataService implements DataService, UserDetailsService
{
    @Override
    public boolean persist(String problem)
    {
        return false;
    }

    @Override
    public Set<String> getRandomData()
    {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException
    {
        return null;
    }
}
