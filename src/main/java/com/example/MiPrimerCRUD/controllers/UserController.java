package com.example.MiPrimerCRUD.controllers;

import com.example.MiPrimerCRUD.models.Usuario;
import com.example.MiPrimerCRUD.services.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity saveUser(@RequestBody Usuario user) {
        return new ResponseEntity(userService.saveUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity getUser(@PathVariable("id") Long userId) {
        return new ResponseEntity(userService.getUser(userId), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity modifyUser(@PathVariable("id") Long userId, @RequestBody Usuario user) {
            return new ResponseEntity(userService.modifyUser(userId, user), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteUser(@PathVariable("id") Long userId) {
        boolean respuesta = userService.deleteUser(userId);
        if (respuesta) {
            return new ResponseEntity(HttpStatus.OK);
        } else {
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
    }

}
