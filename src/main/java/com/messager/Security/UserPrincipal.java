package com.messager.Security;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.messager.Model.Dto.UserDto;
import com.messager.Model.Enum.UserGroupEnum;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class UserPrincipal implements UserDetails
{
    private Long recId;

    private String username;

    private String firstName;

    private String lastName;

    private UserGroupEnum userGroup;

    @JsonIgnore
    private String email;

    @JsonIgnore
    private String password;

    private Collection<? extends GrantedAuthority> authorities;

    public UserPrincipal(Long recId, String firstName, String lastName, String username, String email, UserGroupEnum userGroup, String password, Collection<? extends GrantedAuthority> authorities)
    {
        this.recId = recId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.authorities = authorities;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userGroup = userGroup;
    }

    public static UserPrincipal create(UserDto user)
    {
        List<GrantedAuthority> authorities = new ArrayList<>();

        return new UserPrincipal(
                user.getRecID(),
                user.getFirstName(),
                user.getLastName(),
                user.getUserName(),
                user.getEmail(),
                user.getUserGroup(),
                user.getPassword(),
                authorities
        );
    }

    public Long getRecId()
    {
        return recId;
    }

    public String getEmail()
    {
        return email;
    }

    @Override
    public String getUsername()
    {
        return username;
    }

    @Override
    public String getPassword()
    {
        return password;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public UserGroupEnum getUserGroup()
    {
        return userGroup;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities()
    {
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired()
    {
        return true;
    }

    @Override
    public boolean isAccountNonLocked()
    {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired()
    {
        return true;
    }

    @Override
    public boolean isEnabled()
    {
        return true;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserPrincipal that = (UserPrincipal) o;
        return Objects.equals(recId, that.recId);
    }

    @Override
    public int hashCode()
    {

        return Objects.hash(recId);
    }
}
