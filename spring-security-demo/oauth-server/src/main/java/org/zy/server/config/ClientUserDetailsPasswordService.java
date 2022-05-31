package org.zy.server.config;

import org.springframework.security.core.userdetails.UserDetails;

public interface ClientUserDetailsPasswordService {

    UserDetails updatePassword(String clientId, UserDetails user, String newPassword);

}
