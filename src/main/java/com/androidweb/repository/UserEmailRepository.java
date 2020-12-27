package com.androidweb.repository;


import com.androidweb.entity.UserEmail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEmailRepository extends JpaRepository<UserEmail,Integer> {
}
