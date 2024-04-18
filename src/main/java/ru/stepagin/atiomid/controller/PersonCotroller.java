package ru.stepagin.atiomid.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.stepagin.atiomid.entity.PersonEntity;
import ru.stepagin.atiomid.service.PersonService;

@Slf4j
@RestController
@CrossOrigin
@RequestMapping("${api.endpoint.base-url}/auth")
public class PersonCotroller {
    @Autowired
    PersonService personService;

    @PostMapping("/register")
    public ResponseEntity<PersonEntity> register(@RequestBody String name) {
        // TODO: create login and password
        return ResponseEntity.ok(personService.createPerson(name));
    }
}
