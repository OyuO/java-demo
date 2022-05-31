/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.zy.server.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

/**
 * @author Joe Grandja
 */
@SuppressWarnings("deprecation")
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private CustomAuthenticationProvider provider;

    // @formatter:off
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/oauth2/keys").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin();
    }

//    @Bean
//    public ClientUserDetailsService users() throws Exception {
//        return new ClientUserDetailsServiceImpl();
//    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
<<<<<<< HEAD
//        return super.authenticationManagerBean();
        return new ProviderManager(provider);
=======
        return super.authenticationManagerBean();
//        var authenticationProvider = new AuthenticationProvider() {
//
//            @Override
//            public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//                return authentication;
//            }
//
//            @Override
//            public boolean supports(Class<?> authentication) {
//                return true;
//            }
//        };
//        return new ProviderManager(authenticationProvider);
//    }
>>>>>>> a29381f3814a8d67f0748d2775e1415d69475b0c
    }
}