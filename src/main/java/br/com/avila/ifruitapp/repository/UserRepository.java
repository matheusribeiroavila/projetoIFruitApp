package br.com.avila.ifruitapp.repository;

import br.com.avila.ifruitapp.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer>{

}
