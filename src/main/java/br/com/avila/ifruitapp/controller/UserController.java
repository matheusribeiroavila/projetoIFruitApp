package br.com.avila.ifruitapp.controller;

import br.com.avila.ifruitapp.entity.User;
import br.com.avila.ifruitapp.repository.UserRepository;
import br.com.avila.ifruitapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    UserService userService;
    UserRepository userRepository;

    public UserController(UserService userService, UserRepository userRepository){
        this.userService = userService;
        this.userRepository = userRepository;
    }

    @GetMapping("/user/{id}")
    public User retornaUsuarioPorId(@PathVariable int id){
        return userService.buscarPorId(id);
    }

    @GetMapping("/user/listartodos")
    public Iterable<User> retornaTodosUsers(){
        return userService.retornaTodosUsers();
    }

    @PostMapping("/adduser")
    public User adicionaUsuario(@RequestBody User userTarget){
        return userService.adicionaUsuario(userTarget);
    }

}
