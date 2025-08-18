package com.MillitaryInventoryManagement.MillitaryInventoryManagement.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MillitaryInventoryManagement.MillitaryInventoryManagement.Models.UserModel;

import com.MillitaryInventoryManagement.MillitaryInventoryManagement.repository.Authrepository;


@Service
public class AuthServices {
    @Autowired
    private Authrepository authrepository;
    public Optional<UserModel> loginuser(Long uniqueid,String password){
        Optional<UserModel> user= authrepository.findById(uniqueid);
        if(user.isPresent()){
            if(user.get().getPassword().equals(password)){
                return user;
            }
            else{
                return Optional.empty();
            }
        }
        return Optional.empty();
    }
    public Optional<UserModel> registerUser(UserModel newUser) {
         authrepository.save(newUser);
        return Optional.of(newUser);
    }
}
