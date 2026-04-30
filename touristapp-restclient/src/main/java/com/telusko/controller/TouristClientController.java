package com.telusko.controller;

import com.telusko.dto.Tourist;
import com.telusko.service.TouristClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client/tourist")
@CrossOrigin(origins = "http://localhost:3000")
public class TouristClientController
{
    private TouristClientService service;

     public TouristClientController(TouristClientService service) {
        this.service = service;
    }
    @PostMapping("/register")
    public String register(@RequestBody Tourist tourist)
    {
        return service.registerTourist(tourist);
    }
    @GetMapping("/all")
    public List<Tourist> getAllTourists()
    {
        return service.getAllTourists();
    }
    @GetMapping("/{id}")
    public Tourist getTourist(@PathVariable Integer id)
    {
        return service.getTourist(id);
    }
    @DeleteMapping("/{id}")
     public String deleteTourist(@PathVariable Integer id)
     {
         return service.deleteTourist(id);
     }
     @PutMapping
     public String updateTourist(@RequestBody Tourist tourist)
     {
         return service.updateTourist(tourist);
     }
        @PatchMapping("/{id}/{budget}")
     public String updateBudget(@PathVariable Integer id,@PathVariable Double budget)
     {
         return service.updateBudget(id, budget);
     }
}
