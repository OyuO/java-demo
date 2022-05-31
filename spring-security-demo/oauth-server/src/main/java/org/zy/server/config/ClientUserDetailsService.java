package org.zy.server.config;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface ClientUserDetailsService {

    UserDetails loadUser(String clientId, String username) throws UsernameNotFoundException;

}
