package com.telusko.controller;

import com.telusko.dto.Tourist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;

@Controller
public class TouristClientController {
    @Autowired
    private RestTemplate restTemplate;
    private final String BASE_URL = "http://localhost:8484/api";
   @Autowired
    private WebClient webClient;;
    @GetMapping("/")
    public String home(Model model) {
        String url = BASE_URL + "/get-tourists";
//        List<Tourist> list = Arrays.asList(restTemplate.getForObject(url, Tourist[].class));
     List<Tourist> list=webClient.get()
                     .uri(url)
                             .retrieve()
                                     .bodyToFlux(Tourist.class).collectList().block();
        model.addAttribute("tourists", list);
        return "index";
    }

    @PostMapping("/add")
    public String addTourist(@ModelAttribute Tourist tourist, Model model) {
        String url = BASE_URL + "/reg-tourist";
        System.out.println(tourist);
//        String response = restTemplate.postForObject(url, tourist, String.class);
        String response = webClient.post()
                .uri("/reg-tourist")
                .bodyValue(tourist)
                .retrieve()
                .bodyToMono(String.class)
                .block();
        model.addAttribute("message", response);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String deleteTourist(@RequestParam Integer id) {
        String url = BASE_URL + "/delete-tourist/" + id;
       // restTemplate.delete(url);
        webClient.delete()
                .uri("/delete-tourist/{id}" + id)
                .retrieve()
                .bodyToMono(Void.class)
                .block();

        return "redirect:/";
    }

    @PostMapping("/update-budget")
    public String addTourist(@RequestParam Integer id, @RequestParam Double newBudget) {
        String url = BASE_URL + "/update-tourist-budget/" + id + "/" + newBudget;
        // restTemplate.patchForObject(url, null, String.class, id, newBudget);
    //    restTemplate.patchForObject(url, null, String.class);
        // restTemplate.exchange(url, HttpMethod.PATCH, null, String.class, id, newBudget);

        webClient.patch()
                .uri("/update-tourist-budget/{id}/{newBudget}", id, newBudget)
                .retrieve()
                .bodyToMono(String.class)
                .block();
        return "redirect:/";
    }


}
