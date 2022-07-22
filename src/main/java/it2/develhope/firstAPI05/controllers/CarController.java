package it2.develhope.firstAPI05.controllers;

import it2.develhope.firstAPI05.DTO.CarDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;
//

@RestController
public class CarController {

    @GetMapping(value = "/cars")
    public CarDTO getCar(CarDTO carDTO){
        return new CarDTO("1234-6548","Jeep Renegade",34.20);
    }
    @PostMapping(value = "/cars")
    public String postCar(@Valid @RequestBody CarDTO carDTO){
        System.out.println(carDTO.toString());
        return "Created";
    }
}
