package com.MillitaryInventoryManagement.MillitaryInventoryManagement.repository;
import com.MillitaryInventoryManagement.MillitaryInventoryManagement.Models.UserModel;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Authrepository extends JpaRepository<UserModel,Long> {
    Optional<UserModel> findById(Long id);
    
}
