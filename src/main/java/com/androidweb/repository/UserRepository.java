package com.androidweb.repository;

import com.androidweb.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository <User,Integer>{


    User findByNameAndPassword(String name, String password);

}
