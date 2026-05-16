package br.com.avila.ifruitapp.service;

import br.com.avila.ifruitapp.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    List<User> lista = new ArrayList<>();

    public UserService(){
        this.lista.add(new User(1, "Matheus", "matheus@gmail.com", "111.121.565-55"));
        this.lista.add(new User(2, "Maria", "Maria@gmail.com", "Não tem cpf"));
        this.lista.add(new User(3, "Joao", "joao@gmail.com", "111.121.565-55"));
        this.lista.add(new User(4, "Isadora", "isadora@gmail.com", "Não tem cpf"));
        this.lista.add(new User(5, "Nelson", "nelson@gmail.com", "Não tem cpf"));
    }

    public User buscarPorId(int id){
        for(int i = 0; i <= lista.size(); i++){
            if (this.lista.get(i).getId() == id){
               return this.lista.get(i);
            }
        }

        return null;
    }

    public List<User> retornaTodosUsers(){
        return this.lista;
    }


}
