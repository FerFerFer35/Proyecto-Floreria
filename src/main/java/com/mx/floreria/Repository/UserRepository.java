package com.mx.floreria.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.floreria.Model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long>{
    
}
