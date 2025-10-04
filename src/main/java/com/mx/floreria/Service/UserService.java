package com.mx.floreria.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.floreria.Model.UserModel;
import com.mx.floreria.Repository.UserRepository;
import com.mx.floreria.Response.Response;

@Service
public class UserService implements UserMethods {

    @Autowired
    UserRepository service;

    @Override
    public Response deleteUser(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Response findUser(Long id) {
        if (service.existsById(id)) {
            UserModel userFind = service.findById(id).orElse(null);
            return new Response("Usuario encontrado.", userFind);
        } else {
            return new Response("Usuario no existe.", id);
        }
    }

    @Override
    public Response saveUser(UserModel user) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Response showAllUsers() {
        List<UserModel> list = (List<UserModel>) service.findAll();

        if (list.isEmpty()) {
            return new Response("Lista vacia.", null);
        } else {
            return new Response("Lista de usuarios.", list);
        }
    }

}
