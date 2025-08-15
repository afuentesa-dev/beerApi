package cl.usach.devops.beerApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/v1/beer")
public class BeerController {

    @GetMapping("/list")
    public String listBeers() {
        return "beers";
    }
}
