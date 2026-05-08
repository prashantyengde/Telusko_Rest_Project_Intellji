package com.telusko.service;

import com.telusko.model.Users;
import com.telusko.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
    @Autowired
    private UserRepo repo;
    public Users registerUser(Users user)
    {
        return repo.save(user);
    }
}
