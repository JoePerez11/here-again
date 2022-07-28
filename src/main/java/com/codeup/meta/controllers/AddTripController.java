package com.codeup.meta.controllers;

import com.codeup.meta.entities.Trip;
import com.codeup.meta.repositories.TripRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AddTripController {
    private final TripRepository tripRepository;

    public AddTripController(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    @GetMapping(path = "/add-trip")
    public String main() {
        return "add-trip";
    }

    @PostMapping("/add-trip/post")
    public String saveForm(@ModelAttribute Trip myTrip) {
        tripRepository.save(myTrip);
        return "my-trips/create";
    }
}
