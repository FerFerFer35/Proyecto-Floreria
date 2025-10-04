package com.mx.floreria.Response;

import lombok.Data;

@Data
public class Response {
    String mensaje;

    Object respuesta;

    public Response(String mensaje, Object respuesta) {
        this.mensaje = mensaje;
        this.respuesta = respuesta;
    }
}
