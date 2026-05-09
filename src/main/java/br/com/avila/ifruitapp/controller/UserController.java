package br.com.avila.ifruitapp.controller;

import br.com.avila.ifruitapp.entity.User;
import br.com.avila.ifruitapp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public User retornaUsuarioPorId(@PathVariable int id){
        return userService.buscarPorId(id);
    }

}
