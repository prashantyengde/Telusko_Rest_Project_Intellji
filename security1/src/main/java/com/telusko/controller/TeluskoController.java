package com.telusko.controller;

import com.telusko.model.Alien;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeluskoController
{
    List<Alien> aliens= new ArrayList<>(List.of(new Alien(101,"Ravi","Java"),
            new Alien(102,"Shivam","Python"),
            new Alien(103,"Satyarth","JavaScript")));

    @GetMapping("/info")
    public ResponseEntity<String> getInfo(HttpServletRequest request)
    {
        String info="Welcome to Agentic AI for java dev" + request.getSession().getId();
        return ResponseEntity.ok(info);
    }
    @GetMapping("/course")
    public ResponseEntity<String> getCourseINfo(HttpServletRequest request)
    {
        String info="visit telusko.com for more courses"+ request.getSession().getId();
        return ResponseEntity.ok(info);
    }
    @GetMapping("/aliens")
    public ResponseEntity<List<Alien>> getAliens()
    {        return ResponseEntity.ok(aliens);
    }
    @PostMapping("/addAlien")
    public void addAlien(@RequestBody Alien a)
    {
        System.out.println(a);
            aliens.add(a);
        System.out.println("Alien added successfully");
    }
    @GetMapping("/csrf-token")
    public CsrfToken csrfToken(HttpServletRequest request)
    {
        CsrfToken token = (CsrfToken) request.getAttribute("_csrf");
        return token;
    }

}
