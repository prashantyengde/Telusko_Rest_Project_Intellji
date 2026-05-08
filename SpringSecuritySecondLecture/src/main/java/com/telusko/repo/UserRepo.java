package com.telusko.repo;

import com.telusko.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, String>
{
    Users findByName(String name);
}
