package com.ventaslibres.VentasLibres.repository;

import com.ventaslibres.VentasLibres.domain.user.UserDomain;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends ReactiveCrudRepository<UserDomain,String > {

}
