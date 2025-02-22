package com.example.crowdfunding.repository;

import com.example.crowdfunding.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, String> {

    Optional<User> findByUserName(String userName);
}
