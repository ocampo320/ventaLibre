package com.ventaslibres.VentasLibres.service;

import com.ventaslibres.VentasLibres.domain.user.UserDomain;
import com.ventaslibres.VentasLibres.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class userService {

    @Autowired
    userRepository userRepository;

    public Flux<UserDomain> getAllUser() {
        return userRepository.findAll().switchIfEmpty(Flux.empty());
    }

    public Mono<UserDomain>addUser(UserDomain userDomain){
        return userRepository.save(userDomain);
    }

}
