package com.codeup.meta.repositories;

import com.codeup.meta.entities.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Long>{

}


//package com.codeup.meta.repositories;
//
//        import com.codeup.meta.entities.User;
//        import org.springframework.data.jpa.repository.JpaRepository;
//
//public interface UserRepository extends JpaRepository<User, Long> {
//
//    User findByUsername(String username);
//
//
//}
