package com.mx.floreria.Service;

import com.mx.floreria.Model.UserModel;
import com.mx.floreria.Response.Response;

public interface UserMethods {
    Response saveUser(UserModel user);

    Response deleteUser(Long id);

    Response findUser(Long id);

    Response showAllUsers();
}
