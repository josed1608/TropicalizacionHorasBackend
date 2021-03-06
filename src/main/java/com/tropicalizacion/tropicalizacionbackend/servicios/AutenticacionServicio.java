package com.tropicalizacion.tropicalizacionbackend.servicios;

import com.tropicalizacion.tropicalizacionbackend.excepciones.MalasCredencialesExcepcion;

public interface AutenticacionServicio {
    /**
     * Valida las credenciales provistas y si son correctas devuelve el token para el usuario
     *
     * @param correo el correo del usuario a autenticar
     * @param contrasenna la contraseña del usuario a autenticar
     * @throws MalasCredencialesExcepcion si las credenciales no concuerdan con ningún usuario
     * @return el token del usuario
     */
    String autenticarUsuario(String correo, String contrasenna) throws MalasCredencialesExcepcion;

    /**
     * Valida si el jwt es valido
     *
     * @param token el token a validar
     * @return retorna true si es válido y false si no
     */
    boolean esTokenValido(String token);
}
