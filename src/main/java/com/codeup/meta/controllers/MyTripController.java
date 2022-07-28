package com.codeup.meta.controllers;

import com.codeup.meta.entities.Trip;
import com.codeup.meta.repositories.TripRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyTripController {

    private final TripRepository tripRepository;

    public MyTripController(TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    @GetMapping(path = "/my-trips")
        public String main() {
            return "my-trips";
        }
    

    @GetMapping("/my-trips/create")
    public String showCreateForm(@ModelAttribute Model model) {
        Trip myTrip = new Trip();
        model.addAttribute("trip", myTrip);
        return "my-trips/create";
    }
//    @PostMapping("/add-trip/post")
//    public String saveForm(@ModelAttribute Trip myTrip) {
//        tripRepository.save(myTrip);
//        return "my-trips/create";
//    }
}


