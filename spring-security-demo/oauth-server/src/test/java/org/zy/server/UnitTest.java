package org.zy.server;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.oauth2.provider.endpoint.TokenEndpoint;
import org.springframework.web.HttpRequestMethodNotSupportedException;

import java.util.Collections;
import java.util.LinkedHashMap;

@SpringBootTest
public class UnitTest {


    @Autowired
    private TokenEndpoint tokenEndpoint;

    @Test
    public void test() throws HttpRequestMethodNotSupportedException {
        var user = new User("messaging-client", "null", Collections.emptyList());
        var usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(user, null,Collections.emptyList());
        var map = new LinkedHashMap<String, String>();
        map.put("username", "admin");
        map.put("password", "password");
        map.put("grant_type", "password");
        map.put("scope", "message.read");
        var oAuth2AccessTokenResponseEntity = tokenEndpoint.postAccessToken(usernamePasswordAuthenticationToken, map);
    }
}
