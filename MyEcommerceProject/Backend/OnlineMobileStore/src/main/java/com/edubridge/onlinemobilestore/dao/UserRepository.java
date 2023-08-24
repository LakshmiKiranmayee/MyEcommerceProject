package com.edubridge.onlinemobilestore.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.edubridge.onlinemobilestore.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
