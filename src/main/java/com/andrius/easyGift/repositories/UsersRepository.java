package com.andrius.easyGift.repositories;

import com.andrius.easyGift.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsersRepository extends CrudRepository <User, Long>{
    List<User> findAll();
}
