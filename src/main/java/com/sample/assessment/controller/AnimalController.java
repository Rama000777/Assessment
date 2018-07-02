/**
 * AnimalController
 */
package com.sample.assessment.controller;

/**
 * 
 * @author Ramachandra
 *
 */

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sample.assessment.service.Animal;
import com.sample.assessment.service.AnimalService;
import com.sample.assessment.service.AnimalyFactoryPattern;

@RestController
public class AnimalController {
    
    @Autowired AnimalService animalService;

    @RequestMapping(value = "/search", method = GET)
    public ResponseEntity<Animal> getAnimal(@RequestParam("animalName") String animalName) {
        return new ResponseEntity<>(AnimalyFactoryPattern.getAnimal(animalName), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/count/fly", method = GET)
    public ResponseEntity<Long> getCountOfAnimalsFly() {
        return new ResponseEntity<>(animalService.totalAnimalsFly(), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/count/walk", method = GET)
    public ResponseEntity<Long> getCountOfAnimalsWalk() {
        return new ResponseEntity<>(animalService.totalAnimalsWalk(), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/count/swim", method = GET)
    public ResponseEntity<Long> getCountOfAnimalsSwim() {
        return new ResponseEntity<>(animalService.totalAnimalsSwim(), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/count/sing", method = GET)
    public ResponseEntity<Long> getCountOfAnimalsSing() {
        return new ResponseEntity<>(animalService.totalAnimalsSing(), HttpStatus.OK);
    }
}