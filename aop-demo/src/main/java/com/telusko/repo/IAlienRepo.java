package com.telusko.repo;

import com.telusko.entity.Alien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAlienRepo extends JpaRepository<Alien, Integer>
{
}
