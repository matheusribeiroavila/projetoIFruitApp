package br.com.avila.ifruitapp.service;

import br.com.avila.ifruitapp.entity.User;
import br.com.avila.ifruitapp.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public User buscarPorId(int id){
        return userRepository.findById(id).orElseThrow();
    }

    public Iterable<User> retornaTodosUsers(){
        return userRepository.findAll();
    }

    public User adicionaUsuario(User user){
        return userRepository.save(user);
    }



}
