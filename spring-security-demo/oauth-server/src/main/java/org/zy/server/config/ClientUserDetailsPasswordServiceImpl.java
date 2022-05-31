package org.zy.server.config;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientUserDetailsPasswordServiceImpl implements ClientUserDetailsPasswordService {

    @Override
    public UserDetails updatePassword(String clientId, UserDetails user, String newPassword) {
        var admin = new SimpleGrantedAuthority("admin");
        var authorities = List.of(admin);
        return new User("张三", "123456", authorities);
    }

}
