package com.telusko.controller;

import com.telusko.entity.Alien;
import com.telusko.service.IAlienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlienController
{
    @Autowired
    private  IAlienService service;

    @PostMapping("/addAlien")
    public ResponseEntity<Alien> registerAlien(@RequestBody Alien a)
    {
        System.out.println("AlienController: registerAlien method called");
        Alien alien = service.registerAlien(a);
        return new ResponseEntity<Alien>(alien, HttpStatus.CREATED);
    }
    @GetMapping("/getAllAliens")
    public ResponseEntity<String> getAllAliens()
    {
        String aliens = service.getAllAliens().toString();
        return new ResponseEntity<String>(aliens, HttpStatus.OK);
    }
}
