package org.zy.server.config;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientUserDetailsServiceImpl implements ClientUserDetailsService {

    @Override
    public UserDetails loadUser(String clientId, String username) throws UsernameNotFoundException {
        if ("iam".equals(clientId)) {
            var admin = new SimpleGrantedAuthority("admin");
            var authorities = List.of(admin);
            var password = PasswordEncoderFactories.createDelegatingPasswordEncoder().encode("123456");
            return new User("张三", password, authorities);
        }
        return null;
    }

}
